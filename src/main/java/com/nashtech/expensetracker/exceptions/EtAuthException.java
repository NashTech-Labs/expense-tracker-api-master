package com.nashtech.expensetracker.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)

/**
 *Et Auth Exceptions
 */
public class EtAuthException extends RuntimeException {

    public EtAuthException(String message) {
        super(message);
    }
}
