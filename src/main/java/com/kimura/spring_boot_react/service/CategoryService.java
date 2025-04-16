package com.kimura.spring_boot_react.service;

import com.kimura.spring_boot_react.model.Category;
import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> getAllCategories();
    Optional<Category> getCategoryById(Long id);
    Category saveCategory(Category category);
    Category updateCategory(Category category);
    // Pode ser igual ao save
    void deleteCategory(Long id);
}