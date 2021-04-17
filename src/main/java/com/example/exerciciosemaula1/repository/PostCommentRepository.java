package com.example.exerciciosemaula1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.exerciciosemaula1.domain.PostComment;

@Repository
public interface PostCommentRepository extends JpaRepository<PostComment, Integer> {

}
