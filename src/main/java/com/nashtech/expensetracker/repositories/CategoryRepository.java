package com.nashtech.expensetracker.repositories;

import com.nashtech.expensetracker.exceptions.EtBadRequestException;
import com.nashtech.expensetracker.exceptions.EtResourceNotFoundException;
import com.nashtech.expensetracker.domain.Category;

import java.util.List;

public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);

}
