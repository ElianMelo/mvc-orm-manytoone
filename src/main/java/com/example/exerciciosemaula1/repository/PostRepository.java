package com.example.exerciciosemaula1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.exerciciosemaula1.domain.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
