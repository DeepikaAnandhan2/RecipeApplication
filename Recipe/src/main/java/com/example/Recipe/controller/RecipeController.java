package com.example.Recipe.controller;

import com.example.Recipe.model.Recipe;
import com.example.Recipe.service.RecipeService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@RequestMapping("api")
@RestController
public class RecipeController {
    private final RecipeService recipeService;
    @PostMapping("/recipes")
    public ResponseEntity<?> createRecipe(@RequestBody Recipe recipe) {

        if (recipe.getTitle() == null ||recipe.getCuisine() == null || recipe.getPrep_time() == null || recipe.getCook_time() == null) {

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Recipe save = recipeService.saveRecipe(recipe);
        return new ResponseEntity<>(save, HttpStatus.CREATED);

    }


    @GetMapping("/top")
    public ResponseEntity<?> getTopRecipes(
            @RequestParam(defaultValue = "5") int limit) {

        List<Recipe> recipes = recipeService.getTopRecipes(limit);

        Map<String, Object> response = new HashMap<>();
        response.put("data", recipes);

        return ResponseEntity.ok(response);
    }


}
