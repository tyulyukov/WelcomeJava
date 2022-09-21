package com.example.spring_10.repos.portfolio;

import com.example.spring_10.models.Post;
import com.example.spring_10.models.portfolio.PortfolioItem;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PortfolioItemRepository extends CrudRepository<PortfolioItem, Long> {
}
