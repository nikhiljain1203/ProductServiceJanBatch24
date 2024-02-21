package com.example.productservicejanbatch24.controllers;


import com.example.productservicejanbatch24.models.Category;
import com.example.productservicejanbatch24.repos.CategoryRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    private CategoryRepo categoryRepo;

    public CategoryController(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @GetMapping("/categories/{id}")
    public Category categories(@PathVariable("id") Long id) {
        return categoryRepo.findById(id).get();
    }
}
