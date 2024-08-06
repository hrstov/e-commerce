package com.ecommerce.backend.category.controller;

import com.ecommerce.backend.category.model.Category;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryController {

    ResponseEntity<List<Category>> getAllCategories();
    ResponseEntity<Category> getCategoryById(int id);

    ResponseEntity<Void> deleteCategory(int id);

}
