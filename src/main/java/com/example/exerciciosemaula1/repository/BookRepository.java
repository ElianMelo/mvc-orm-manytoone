package com.example.exerciciosemaula1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.exerciciosemaula1.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
