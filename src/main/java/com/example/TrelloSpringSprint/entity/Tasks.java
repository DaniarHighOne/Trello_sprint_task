package com.example.TrelloSpringSprint.entity;

import com.example.TrelloSpringSprint.enums.TaskStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tasks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tasks {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name= "ID")
    private Long id;

    @Column(name="NAME", columnDefinition = "VARCHAR(250)", nullable = false)
    private String title;

    @Column(name="DESCRIPTION", columnDefinition = "TEXT")
    private String description;

    @Column(name="STATUS", columnDefinition = "VARCHAR(20)", nullable = false)
    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @ManyToOne
    @JoinColumn(name="FOLDER_ID")
    private Folders folder;

}
