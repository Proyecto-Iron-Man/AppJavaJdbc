package com.ironman.dao;

import com.ironman.entity.Category;

import java.util.List;

public interface CategoryDao {

    List<Category> findAll() throws Exception;
    Category findById(Long id) throws Exception;
    int create(Category category) throws Exception;
    int update(Long id, Category category) throws Exception;
    void deleteById(Long id) throws Exception;
}
