package com.example.TrelloSpringSprint.repository;

import com.example.TrelloSpringSprint.entity.TaskCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskCategoryRepository extends JpaRepository<TaskCategory,Long> {
}
