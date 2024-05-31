package com.ironman.application.service.impl;

import com.ironman.application.dto.category.CategoryDto;
import com.ironman.application.dto.category.CategorySmallDto;
import com.ironman.application.mapper.CategoryMapper;
import com.ironman.application.service.CategoryService;
import com.ironman.persistence.dao.CategoryDao;
import com.ironman.persistence.dao.impl.CategoryDaoImpl;
import com.ironman.persistence.entity.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    private CategoryDao categoryDao;
    private CategoryMapper categoryMapper;

    @Override
    public List<CategorySmallDto> findAll() throws Exception {

        categoryDao = new CategoryDaoImpl();
        categoryMapper = new CategoryMapper();

//        List<Category> categories = categoryDao.findAll();
//
//        List<CategorySmallDto> dtos = new ArrayList<>();
//
//        for (Category category : categories) {
//            dtos.add(categoryMapper.toSmallDto(category));
//        }
//
//        return dtos;


        return categoryDao.findAll()
                .stream()
                .map(category -> categoryMapper.toSmallDto(category))
                .toList();
    }

    @Override
    public CategoryDto findById(Long id) throws Exception {
        categoryDao = new CategoryDaoImpl();
        categoryMapper = new CategoryMapper();

//        Category category = categoryDao.findById(id);
//
//        CategoryDto dto = categoryMapper.toDto(category);
//
//        return dto;

        return categoryMapper.toDto(categoryDao.findById(id));
    }
}
