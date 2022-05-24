package com.deepak.expensetracker.services;

import com.deepak.expensetracker.exceptions.EtBadRequestException;
import com.deepak.expensetracker.exceptions.EtResourceNotFoundException;
import com.deepak.expensetracker.domain.Category;

import java.util.List;
import jdk.jfr.Category;

public interface CategoryService {

    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

}
