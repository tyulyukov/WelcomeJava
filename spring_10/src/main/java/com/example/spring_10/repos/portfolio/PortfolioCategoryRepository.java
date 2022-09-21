package com.example.spring_10.repos.portfolio;

import com.example.spring_10.models.portfolio.PortfolioCategory;
import org.springframework.data.repository.CrudRepository;

public interface PortfolioCategoryRepository extends CrudRepository<PortfolioCategory, Long> {
}
