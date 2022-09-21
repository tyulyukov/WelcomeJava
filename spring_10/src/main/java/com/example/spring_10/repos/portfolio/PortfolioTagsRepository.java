package com.example.spring_10.repos.portfolio;

import com.example.spring_10.models.portfolio.PortfolioItem;
import com.example.spring_10.models.portfolio.PortfolioTag;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PortfolioTagsRepository extends CrudRepository<PortfolioTag, Long> {
}
