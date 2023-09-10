package com.example.TrelloSpringSprint.controller;

import com.example.TrelloSpringSprint.entity.Folders;
import com.example.TrelloSpringSprint.entity.Tasks;
import com.example.TrelloSpringSprint.service.FolderService;
import com.example.TrelloSpringSprint.service.TasksService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final TasksService tasksService;
    private final FolderService folderService;


    @GetMapping("/")
    public String homePage(Model model) {
    var folders = folderService.getFolders();
    model.addAttribute("folders", folders);

        return "home";
    }

    @PostMapping("/add-folder")
    public String addFolder(Folders folder) {
        folderService.createFolder(folder);

        return "redirect:/";
    }

    @GetMapping("/details")
     public String detailsTask(Long id) {
        tasksService.getTaskById(id);

        return "folderDetails";
    }

}
