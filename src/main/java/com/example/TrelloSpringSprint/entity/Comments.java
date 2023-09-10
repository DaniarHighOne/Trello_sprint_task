package com.example.TrelloSpringSprint.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name="COMMENTS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
    private Long id;

    @Column(name="NAME", columnDefinition = "TEXT", nullable = false)
    private String comment;

    @ManyToOne
    @JoinColumn(name = "TASK_ID")
    private Tasks tasks;
}
