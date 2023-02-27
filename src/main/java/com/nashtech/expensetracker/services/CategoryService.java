package com.nashtech.expensetracker.services;

import com.nashtech.expensetracker.exceptions.EtBadRequestException;
import com.nashtech.expensetracker.exceptions.EtResourceNotFoundException;
import com.nashtech.expensetracker.domain.Category;

import java.util.List;

public interface CategoryService {

    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}
