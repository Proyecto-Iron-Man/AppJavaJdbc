package com.ironman;

import com.ironman.dao.CategoryDao;
import com.ironman.entity.Category;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CategoryDao categoryDao = new CategoryDao();

        List<Category> categories = categoryDao.findAll();

        System.out.println("Categories start:");
        for (Category category : categories) {
            System.out.println("Id: " + category.getId());
            System.out.println("Name: " + category.getName());
            System.out.println("Description: " + category.getDescription());
            System.out.println("Url key: " + category.getUrlKey());
            System.out.println("State: " + category.getState());
            System.out.println("Created at: " + category.getCreatedAt());
            System.out.println();
        }

        System.out.println("Categories end.");

    }
}