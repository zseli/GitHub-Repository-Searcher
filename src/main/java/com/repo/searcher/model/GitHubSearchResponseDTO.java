package com.repo.searcher.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GitHubSearchResponseDTO {
    private int total_count;
    private boolean incomplete_results;
    private List<GitHubRepoResponseDTO> items;
}
