package com.example.s13firstspringproject.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

@Data
public class PostWithOwnerDTO {

    private int id;
    private String title;
    private UserWithoutPostsDTO owner;
}
