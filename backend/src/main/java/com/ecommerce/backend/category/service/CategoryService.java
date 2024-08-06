package com.ecommerce.backend.category.service;

import com.ecommerce.backend.category.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> getAllCategories();
    Optional<Category> getCategoriesById(int id);

    void deleteCategory(int id);

}
