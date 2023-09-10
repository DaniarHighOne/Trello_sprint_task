package com.example.TrelloSpringSprint.service;

import com.example.TrelloSpringSprint.entity.Tasks;
import com.example.TrelloSpringSprint.repository.FoldersRepository;
import com.example.TrelloSpringSprint.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class TasksService {
    private final TaskRepository taskRepository;
    private final FoldersRepository foldersRepository;

    public List<Tasks> getTask(){
        return taskRepository.findAll();
    }

    public Tasks getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found!"));
    }
}
