package com.nashtech.expensetracker.repositories;

import com.nashtech.expensetracker.exceptions.EtAuthException;
import com.nashtech.expensetracker.domain.User;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
