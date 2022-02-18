package com.example.s13firstspringproject.controller;

import com.example.s13firstspringproject.exceptions.UnauthorizedException;
import com.example.s13firstspringproject.model.dto.UserWithPostsDTO;
import com.example.s13firstspringproject.model.dto.UserWithoutPostsDTO;
import com.example.s13firstspringproject.model.entities.Post;
import com.example.s13firstspringproject.model.entities.User;
import com.example.s13firstspringproject.model.dto.RegisterUserDTO;
import com.example.s13firstspringproject.model.dto.UserResponseDTO;
import com.example.s13firstspringproject.services.UserService;
import lombok.SneakyThrows;
import lombok.Synchronized;
import org.apache.commons.io.FilenameUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

@RestController
public class UserController {

    public static final String LOGGED = "logged";
    public static final String LOGGED_FROM = "logged_from";
    public static final String USER_ID = "user_id";

    @Autowired
    private UserService userService;
    @Autowired
    private ModelMapper modelMapper;

    private ArrayList<User> users = new ArrayList<>();

    @PostMapping("/login")
    public UserResponseDTO login(@RequestBody User user, HttpSession session, HttpServletRequest request){
        String username = user.getUsername();
        String password = user.getPassword();
        User u = userService.login(username, password);
        session.setAttribute(LOGGED, true);
        session.setAttribute("logged_from", request.getRemoteAddr());
        session.setAttribute(USER_ID, u.getId());
        UserResponseDTO dto = modelMapper.map(u, UserResponseDTO.class);
        return dto;
    }

    @PostMapping("/reg")
    public ResponseEntity<UserResponseDTO> register(@RequestBody RegisterUserDTO user){
        String username = user.getUsername();
        String password = user.getPassword();
        String confirmPassword = user.getPassword2();
        User u = userService.register(username, password, confirmPassword);
        users.add(u);
        UserResponseDTO dto = modelMapper.map(u, UserResponseDTO.class);
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserWithPostsDTO> getById(@PathVariable int id){
        return ResponseEntity.ok(userService.getById(id));
    }

    @PutMapping("/users")
    public ResponseEntity<UserResponseDTO> edit(@RequestBody User user, HttpSession session, HttpServletRequest request){
        validateLogin(session, request);
        User u = userService.edit(user);
        UserResponseDTO dto = modelMapper.map(u, UserResponseDTO.class);
        return ResponseEntity.ok(dto);
    }

    //TODO refactor -> remove session from parameters
    public static void validateLogin(HttpSession session, HttpServletRequest request) {
        boolean newSession = session.isNew();
        boolean logged = session.getAttribute(LOGGED) != null && ((Boolean)session.getAttribute(LOGGED));
        boolean sameIP = request.getRemoteAddr().equals(session.getAttribute(LOGGED_FROM));
        if(newSession || !logged || !sameIP){
            throw new UnauthorizedException("You have to login!");
        }
    }

    @PostMapping("/logout")
    public void logOut(HttpSession session){
        session.invalidate();
    }

    @SneakyThrows
    @PostMapping("/users/image")
    public String uploadProfileImage(@RequestParam(name = "file") MultipartFile file, HttpServletRequest request){
        return userService.uploadFile(file, request);
    }
}
