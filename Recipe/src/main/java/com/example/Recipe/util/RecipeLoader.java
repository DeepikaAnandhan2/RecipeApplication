package com.example.Recipe.util;

import com.example.Recipe.model.Recipe;
import com.example.Recipe.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import tools.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class RecipeLoader {

    @Autowired
    private RecipeRepository recipeRepository;


    public void run(String... args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InputStream inputStream =
                new ClassPathResource("US_recipes_null.json").getInputStream();
        List<Recipe> r =
                Arrays.asList(mapper.readValue(inputStream, Recipe[].class));
        for (Recipe recipe : r) {
            recipe.setTotal_time(
                    recipe.getPrep_time() + recipe.getCook_time());
        }
        recipeRepository.saveAll(r);
    }


}
