package com.example.TrelloSpringSprint.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="FOLDERS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Folders {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name= "ID")
    private Long id;

    @Column(name="NAME", columnDefinition = "VARCHAR(50)", nullable = false, unique = true)
    private String name;

    @ManyToMany
    private List<TaskCategory> taskCategories;
}
