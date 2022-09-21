package com.example.spring_10.models.portfolio;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "portfolio_items")
public class PortfolioItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "portfolio_category_id")
    private PortfolioCategory portfolioCategory;

    @ManyToMany
    private Set<PortfolioTag> portfolioTags;

    private String name;
    private String mainImg;
    @Column(columnDefinition="TEXT")
    private String description;
    private Integer price;
    private Integer time;

    @CreationTimestamp
    private Date createdAt;


}