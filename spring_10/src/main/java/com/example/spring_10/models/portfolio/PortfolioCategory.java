package com.example.spring_10.models.portfolio;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "portfolio_categories")
public class PortfolioCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany
    @JoinColumn(name = "portfolio_category_id")
    private Set<PortfolioItem> portfolioItems;

    private String name;

    @CreationTimestamp
    private Date createdAt;
}