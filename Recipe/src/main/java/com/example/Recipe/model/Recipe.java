package com.example.Recipe.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "recipe")
@Data
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String cuisine;
    private Float rating;
    private Integer prep_time;
    private Integer cook_time;
    private Integer total_time;
    private String description;
    private Nutrients nutrients;
    private String serves;


}