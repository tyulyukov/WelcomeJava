package com.example.spring_10.repos.trello;

import com.example.spring_10.models.trello.TrelloBoard;
import org.springframework.data.repository.CrudRepository;

public interface TrelloBoardRepository extends CrudRepository<TrelloBoard, Long> {
}
