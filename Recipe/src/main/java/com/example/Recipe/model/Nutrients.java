package com.example.Recipe.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Nutrients {

    private String calories;
    private String carbohydrateContent;
    private String proteinContent;
    private String fatContent;

}