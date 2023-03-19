package com.foltan.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foltan.library.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
