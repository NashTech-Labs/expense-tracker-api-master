package com.deepak.expensetracker.services;

import com.deepak.expensetracker.exceptions.EtAuthException;
import com.deepak.expensetracker.domain.User;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;

}
