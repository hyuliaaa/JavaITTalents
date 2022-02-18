package com.example.s13firstspringproject.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserWithPostsDTO {

    private int id;
    private String username;
    private String profileImgUrl;
    List<PostWithoutOwnerDTO> posts;
}
