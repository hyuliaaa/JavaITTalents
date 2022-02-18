package com.example.s13firstspringproject.model.entities;

import javax.persistence.*;

@Entity(name = "post_images")
public class PostImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
    private String imageUrl;
}
