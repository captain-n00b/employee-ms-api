package com.noob.Employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class ValidationException extends RuntimeException {

    public ValidationException () {
        super();
    }

    public ValidationException(String errorMessage) {
        super(errorMessage);
    }

    public ValidationException (String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
