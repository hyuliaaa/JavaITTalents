package com.example.s13firstspringproject.controller;

import com.example.s13firstspringproject.model.dto.AddPostDTO;
import com.example.s13firstspringproject.model.dto.PostWithOwnerDTO;
import com.example.s13firstspringproject.model.dto.UserWithoutPostsDTO;
import com.example.s13firstspringproject.model.entities.Post;
import com.example.s13firstspringproject.services.PostService;
import com.example.s13firstspringproject.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RestController
@Validated
public class PostController {

    @Autowired
    private PostService postService;
    @Autowired
    private ModelMapper mapper;

    @PostMapping("/posts")
    public Post add(@Valid @RequestBody AddPostDTO post, HttpSession session){
        return postService.addPost(post, (Integer) session.getAttribute(UserController.USER_ID));
    }

    @GetMapping("/posts/{id}")
    public PostWithOwnerDTO getById(@PathVariable int id){
        Post p = postService.getPost(id);
        PostWithOwnerDTO dto = new PostWithOwnerDTO();
        dto.setId(p.getId());
        dto.setTitle(p.getTitle());
        dto.setOwner(mapper.map(p.getOwner(), UserWithoutPostsDTO.class));
        return dto;
    }

    @PostMapping("/posts/{id}/like")
    public int likePost(@PathVariable int id, HttpSession session, HttpServletRequest request){
        UserController.validateLogin(session, request);
        return postService.likePost(id, (Integer) session.getAttribute(UserController.USER_ID));
    }

    @PostMapping("/posts/{id}/unlike")
    public int unlikePost(@PathVariable int id, HttpSession session, HttpServletRequest request){
        UserController.validateLogin(session, request);
        return postService.unlikePost(id, (Integer) session.getAttribute(UserController.USER_ID));
    }
}
