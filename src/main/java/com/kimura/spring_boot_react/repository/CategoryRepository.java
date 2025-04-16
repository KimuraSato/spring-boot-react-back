package com.kimura.spring_boot_react.repository;

import com.kimura.spring_boot_react.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

