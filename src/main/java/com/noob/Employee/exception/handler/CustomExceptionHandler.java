package com.noob.Employee.exception.handler;

import com.noob.Employee.Util.Validation;
import com.noob.Employee.exception.ValidationException;
import com.noob.Employee.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ErrorResponse> employeeDetailsErrorHandler (ValidationException ex) {
        ErrorResponse errorResponse = new ErrorResponse("1", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_ACCEPTABLE);
    }
}
