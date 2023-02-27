package com.nashtech.expensetracker.services;

import com.nashtech.expensetracker.exceptions.EtAuthException;
import com.nashtech.expensetracker.domain.User;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;

}
