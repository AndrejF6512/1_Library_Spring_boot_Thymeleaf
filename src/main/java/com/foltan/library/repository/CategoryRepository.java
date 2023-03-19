package com.foltan.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foltan.library.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
