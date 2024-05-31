package com.ironman.application.dto.category;

import java.time.LocalDateTime;

public class CategoryDto {
    // Attributes
    private Long id;
    private String name;
    private String description;
    private String urlKey;
    private String state;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // constructor

    public CategoryDto() {
    }

    public CategoryDto(Long id, String name, String description, String urlKey, String state, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.urlKey = urlKey;
        this.state = state;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    // encapsulates


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlKey() {
        return urlKey;
    }

    public void setUrlKey(String urlKey) {
        this.urlKey = urlKey;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
