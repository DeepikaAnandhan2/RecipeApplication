package com.example.Recipe.service;

import com.example.Recipe.model.Recipe;
import com.example.Recipe.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public Recipe saveRecipe(Recipe recipe) {
        recipe.setTotal_time(recipe.getPrep_time()+recipe.getCook_time());
        return recipeRepository.save(recipe);
    }


    public List<Recipe> getTopRecipes(int limit) {
        return recipeRepository.findAll(
                PageRequest.of(0, limit, Sort.by("rating").descending())
        ).getContent();
    }

}
