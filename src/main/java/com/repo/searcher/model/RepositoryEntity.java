package com.repo.searcher.model;

import java.time.Instant;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "repositories")
@Data
@Builder
public class RepositoryEntity {
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private String owner;

    private String language;

    @Column(name = "stars")
    private int starsCount;

    @Column(name = "forks")
    private int forksCount;

    @Column(name = "last_updated")
    private Instant lastUpdated;
}
