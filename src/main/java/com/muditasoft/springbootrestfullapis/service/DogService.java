package com.muditasoft.springbootrestfullapis.service;

import com.muditasoft.springbootrestfullapis.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveDogs();
    List<String> retrieveDogBreeds();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
