package com.example.spring_10.models.trello;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "trello_columns")
public class TrelloColumn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "trello_board_id")
    private TrelloBoard trelloBoard;

    @OneToMany
    @JoinColumn(name = "trello_column_id")
    private Set<TrelloCard> trelloCards = new HashSet<>();

    @CreationTimestamp
    private Date createdAt;
}