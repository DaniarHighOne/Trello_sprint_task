package com.example.TrelloSpringSprint.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public enum TaskStatus {
    TO_DO("In the middle of process"),
    IN_TEST("During test"),
    DONE("Task is done"),
    FAILED("Drop the task");

    @Getter
    private String message;
}
