package com.example.Recipe.repository;


import com.example.Recipe.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Component
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    List<Recipe> findTopByOrderByRatingDesc(Pageable pageable);

}