package com.ironman;

import com.ironman.entity.Category;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Category category = new Category();

        category.setId(1L);
        category.setName("Category 1");
        category.setDescription("Description 1");
        category.setUrlKey("category-1");
        category.setState("A");


        System.out.println("Category Name: " + category.getName());

        Category category2 = new Category(2L, "Category 2", "Description 2", "category-2", "A", null, null);
        System.out.println("Category 2 Description: " + category2.getDescription());

    }
}