package com.denniscoding.demo.repositories;

import com.denniscoding.demo.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
