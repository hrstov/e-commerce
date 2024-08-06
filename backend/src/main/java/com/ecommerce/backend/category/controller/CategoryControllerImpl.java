package com.ecommerce.backend.category.controller;

import com.ecommerce.backend.category.model.Category;
import com.ecommerce.backend.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryControllerImpl implements CategoryController{
    @Autowired
    private CategoryService categoryService;

    @Override
    @GetMapping()
    public ResponseEntity<List<Category>> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable int id) {
        Optional<Category> optionalCategory = categoryService.getCategoriesById(id);

        if (optionalCategory.isPresent()){
            return ResponseEntity.ok(optionalCategory.get());
        }else return ResponseEntity.notFound().build();

    }

    @Override
    public ResponseEntity<Void> deleteCategory(int id) {
        categoryService.deleteCategory(id);
        return ResponseEntity.notFound().build();
    }
}
