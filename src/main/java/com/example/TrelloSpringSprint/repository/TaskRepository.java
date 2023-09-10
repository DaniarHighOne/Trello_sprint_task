package com.example.TrelloSpringSprint.repository;

import com.example.TrelloSpringSprint.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Tasks, Long> {
}
