package com.muditasoft.springbootrestfullapis.service;

import com.muditasoft.springbootrestfullapis.entity.Dog;

import java.util.List;

public interface DogService {
    public List<Dog> retrieveDogs();
}
