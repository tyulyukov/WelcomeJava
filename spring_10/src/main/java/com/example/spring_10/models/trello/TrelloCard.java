package com.example.spring_10.models.trello;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "trello_cards")
public class TrelloCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "trello_column_id")
    private TrelloColumn trelloColumn;

    @CreationTimestamp
    private Date createdAt;
}