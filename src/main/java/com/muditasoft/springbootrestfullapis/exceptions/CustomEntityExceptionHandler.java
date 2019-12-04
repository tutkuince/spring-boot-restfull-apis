package com.muditasoft.springbootrestfullapis.exceptions;

import com.muditasoft.springbootrestfullapis.exceptions.response.DogNotFoundExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public final ResponseEntity<DogNotFoundExceptionResponse> handleDogNotFoundException(DogNotFoundException e) {
        DogNotFoundExceptionResponse exceptionResponse = new DogNotFoundExceptionResponse(e.getMessage());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }
}
