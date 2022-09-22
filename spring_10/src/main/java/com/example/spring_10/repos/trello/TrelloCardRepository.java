package com.example.spring_10.repos.trello;

import com.example.spring_10.models.trello.TrelloCard;
import org.springframework.data.repository.CrudRepository;

public interface TrelloCardRepository extends CrudRepository<TrelloCard, Long> {
}
