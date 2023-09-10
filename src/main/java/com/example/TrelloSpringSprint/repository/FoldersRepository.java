package com.example.TrelloSpringSprint.repository;

import com.example.TrelloSpringSprint.entity.Folders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoldersRepository extends JpaRepository<Folders, Long> {
}
