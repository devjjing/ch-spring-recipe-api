package com.example.recipeapi.controller;

import com.example.recipeapi.recipe.Recipe;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping(path = "/recipes")
public class RecipeController {

    List<String> stringList = new ArrayList<>();
    @GetMapping
    public List<Recipe> getRecipes(){

    }







}


