package com.example.recipeapi.service;

import com.example.recipeapi.recipe.Recipe;
import com.example.recipeapi.repository.RecipeRepository;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

}
