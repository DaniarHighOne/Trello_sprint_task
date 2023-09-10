package com.example.TrelloSpringSprint.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="TASK_CATEGORIES")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
    private Long id;

    @Column(name="NAME", columnDefinition = "VARCHAR(50)", nullable = false, unique = true)
    private String name;
}
