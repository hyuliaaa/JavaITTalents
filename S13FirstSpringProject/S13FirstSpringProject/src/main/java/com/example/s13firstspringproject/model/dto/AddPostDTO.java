package com.example.s13firstspringproject.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class AddPostDTO {
    @NotBlank(message = "Post title is mandatory!")
    private String title;
}
