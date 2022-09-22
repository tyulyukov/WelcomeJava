package com.example.spring_10.models.trello;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "trello_boards")
public class TrelloBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany
    private Set<TrelloColumn> trelloColumns = new HashSet<>();

    private String name;

    @CreationTimestamp
    private Date createdAt;
}