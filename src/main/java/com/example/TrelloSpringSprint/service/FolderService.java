package com.example.TrelloSpringSprint.service;

import com.example.TrelloSpringSprint.entity.Folders;
import com.example.TrelloSpringSprint.repository.FoldersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FolderService {
    private final FoldersRepository foldersRepository;


    public void createFolder(Folders folder) {
        foldersRepository.save(folder);
    }

    public List<Folders> getFolders() {

        return foldersRepository.findAll();
    }
}
