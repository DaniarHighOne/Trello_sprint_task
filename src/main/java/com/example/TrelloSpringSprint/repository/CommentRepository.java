package com.example.TrelloSpringSprint.repository;

import com.example.TrelloSpringSprint.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comments,Long> {
}
