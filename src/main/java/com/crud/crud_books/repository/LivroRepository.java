package com.crud.crud_books.repository;

import com.crud.crud_books.models.livroModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<livroModels, Long> {
}
