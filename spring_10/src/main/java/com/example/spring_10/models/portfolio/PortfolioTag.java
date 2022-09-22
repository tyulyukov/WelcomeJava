package com.example.spring_10.models.portfolio;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "portfolio_tags")
public class PortfolioTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToMany(mappedBy = "portfolioTags")
    private Set<PortfolioItem> portfolioItems;

    private String name;

    @CreationTimestamp
    private Date createdAt;
}