package com.deepak.expensetracker.repositories;

import com.deepak.expensetracker.exceptions.EtBadRequestException;
import com.deepak.expensetracker.exceptions.EtResourceNotFoundException;
import com.deepak.expensetracker.domain.Category;

import java.util.List;
import jdk.jfr.Category;

public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);

}
