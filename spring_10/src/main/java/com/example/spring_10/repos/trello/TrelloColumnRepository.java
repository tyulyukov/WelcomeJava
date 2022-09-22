package com.example.spring_10.repos.trello;

import com.example.spring_10.models.trello.TrelloColumn;
import org.springframework.data.repository.CrudRepository;

public interface TrelloColumnRepository extends CrudRepository<TrelloColumn, Long> {
}
