package com.muditasoft.springbootrestfullapis.exceptions.response;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DogNotFoundExceptionResponse {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String dogNotFound;

    public DogNotFoundExceptionResponse(String dogNotFound) {
        this.dogNotFound = dogNotFound;
    }
}
