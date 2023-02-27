package com.nashtech.expensetracker.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Et Resource Not Found Exception
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EtResourceNotFoundException extends RuntimeException {

    public EtResourceNotFoundException(String message) {
        super(message);
    }
}
