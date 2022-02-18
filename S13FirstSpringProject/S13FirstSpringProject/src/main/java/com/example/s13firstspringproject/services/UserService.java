package com.example.s13firstspringproject.services;

import com.example.s13firstspringproject.controller.UserController;
import com.example.s13firstspringproject.exceptions.BadRequestException;
import com.example.s13firstspringproject.exceptions.NotFoundException;
import com.example.s13firstspringproject.exceptions.UnauthorizedException;
import com.example.s13firstspringproject.model.dto.PostWithoutOwnerDTO;
import com.example.s13firstspringproject.model.dto.UserWithPostsDTO;
import com.example.s13firstspringproject.model.dto.UserWithoutPostsDTO;
import com.example.s13firstspringproject.model.entities.Post;
import com.example.s13firstspringproject.model.entities.User;
import com.example.s13firstspringproject.model.repositories.UserRepository;
import lombok.SneakyThrows;
import org.apache.commons.io.FilenameUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.nio.file.Files;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private PostService postService;
    @Autowired
    private ModelMapper mapper;


    public User login(String username, String password){
        if(username == null || username.isBlank()){
            throw new BadRequestException("Username is mandatory");
        }
        if(password == null || password.isBlank()){
            throw new BadRequestException("Password is mandatory");
        }

        User u = userRepository.findByUsername(username);
        if(u == null){
            throw new UnauthorizedException("Wrong credentials");
        }
        if(!passwordEncoder.matches(password, u.getPassword())){
            throw new UnauthorizedException("Wrong credentials");
        }
        return u;
    }

    public User register(String username, String password, String confirmPassword) {
        if(username == null || username.isBlank()){
            throw new BadRequestException("Username is mandatory");
        }
        if(username.length() <= 5){
            throw new BadRequestException("Username should be at least 6 symbols");
        }
        if(password == null || password.isBlank()){
            throw new BadRequestException("Password is mandatory");
        }
//        if(!password.matches("")){
//            throw new BadRequestException("Password must be hairy");
//        }
        if(!password.equals(confirmPassword)){
            throw new BadRequestException("Passwords mismatch");
        }
        if(userRepository.findByUsername(username) != null){
            throw new BadRequestException("User already exists");
        }
        User u = new User();
        u.setUsername(username);
        u.setPassword(passwordEncoder.encode(password));//TODO add bcrypt
        userRepository.save(u);
        return u;
    }

    public UserWithPostsDTO getById(int id) {
        Optional<User> opt = userRepository.findById(id);
        if(opt.isPresent()){
            User u = opt.get();
            UserWithPostsDTO dto = mapper.map(u, UserWithPostsDTO.class);
            Set<Post> posts = u.getPosts();
            dto.setPosts(posts.stream().map(p -> mapper.map(p, PostWithoutOwnerDTO.class)).collect(Collectors.toList()));
            return dto;
        }
        else{
            throw new NotFoundException("User not found");
        }
    }

    //@Transactional
    public User edit(User user) {
        Optional<User> opt = userRepository.findById(user.getId());
        if(opt.isPresent()){
            userRepository.save(user);//update users set ..... where id = user.getId
            //commentRepository.deleteAll(user.getComments());
            return user;
        }
        else{
            throw new NotFoundException("User not found");
        }
    }

    @SneakyThrows
    public String uploadFile(MultipartFile file, HttpServletRequest request) {
        UserController.validateLogin(request.getSession(), request);
        int loggedUserId = (int) request.getSession().getAttribute(UserController.USER_ID);
        String extension = FilenameUtils.getExtension(file.getOriginalFilename());
        String name = System.nanoTime() + "." + extension;
        Files.copy(file.getInputStream(), new File("uploads" + File.separator + name).toPath());
        User u = postService.getUserById(loggedUserId);
        u.setProfileImgUrl(name);
        userRepository.save(u);
        return name;
    }
}
