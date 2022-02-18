package com.example.s13firstspringproject.services;

import com.example.s13firstspringproject.exceptions.BadRequestException;
import com.example.s13firstspringproject.exceptions.NotFoundException;
import com.example.s13firstspringproject.exceptions.UnauthorizedException;
import com.example.s13firstspringproject.model.dto.AddPostDTO;
import com.example.s13firstspringproject.model.entities.Post;
import com.example.s13firstspringproject.model.entities.User;
import com.example.s13firstspringproject.model.repositories.PostRepository;
import com.example.s13firstspringproject.model.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;

    public Post addPost(AddPostDTO postDTO, Integer id){
        if(id == null){
            throw new UnauthorizedException("Please login");
        }
        //assign owner to logged user
        Post post = new Post();
        post.setOwner(userRepository.findById(id).orElseThrow(() -> new NotFoundException("Owner not found")));
        post.setTitle(postDTO.getTitle());
        postRepository.save(post);
        return post;
    }

    public Post getPost(int id) {
        return getPostById(id);
    }

    public int likePost(int postId, int userId) {
        Post post = getPostById(postId);
        User user = getUserById(userId);
        if(user.getLikedPosts().contains(post)){
            throw new BadRequestException("User already liked this post!");
        }
        post.getLikers().add(user);
        postRepository.save(post);
        return post.getLikers().size();
    }

    public int unlikePost(int postId, int userId) {
        Post post = getPostById(postId);
        User user = getUserById(userId);
        if(!user.getLikedPosts().contains(post)){
            throw new BadRequestException("You have to like the post in order to unlike it!");
        }
        post.getLikers().remove(user);
        postRepository.save(post);
        return post.getLikers().size();
    }

    //TODO iznesi go tova na chitavo mqsto
    private Post getPostById(int id){
        return postRepository.findById(id).orElseThrow(() -> new NotFoundException("Post not found"));
    }

    //TODO iznesi go tova na chitavo mqsto
    public User getUserById(int id){
        return userRepository.findById(id).orElseThrow(() -> new NotFoundException("User not found"));
    }
}
