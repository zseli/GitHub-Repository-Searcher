package com.repo.searcher.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GitHubRepoResponseDTO {
    private Long id;
    private String name;

    @JsonProperty("full_name")
    private String fullName;

    private Owner owner;
    private String description;
    private String language;

    @JsonProperty("stargazers_count")
    private int stars;

    @JsonProperty("forks_count")
    private int forks;

    @JsonProperty("updated_at")
    private String lastUpdated;

    @Getter
    @Setter
    public static class Owner {
        private String login;
    }
}
