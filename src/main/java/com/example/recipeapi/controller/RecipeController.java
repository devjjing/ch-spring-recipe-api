package com.example.recipeapi.controller;

import com.example.recipeapi.recipe.Recipe;
import com.example.recipeapi.service.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/recipes")

public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @GetMapping( "/{id}")
    public List<Recipe> getRecipeByID(@PathVariable Long id) {
        return recipeService.getRecipeByID(id);
    }

}


