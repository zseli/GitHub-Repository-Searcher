package com.repo.searcher.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SearchRequestDTO {
    @NotBlank(message = "Query cannot be empty")
    private String query;

    @NotBlank(message = "Language cannot be empty")
    private String language; 

    @NotBlank(message = "Sort cannot be empty")
    private String sort;  
}
