package com.muditasoft.springbootrestfullapis.service.impl;

import com.muditasoft.springbootrestfullapis.entity.Dog;
import com.muditasoft.springbootrestfullapis.exceptions.DogNotFoundException;
import com.muditasoft.springbootrestfullapis.repository.DogRepository;
import com.muditasoft.springbootrestfullapis.service.DogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService {

    private final DogRepository dogRepository;

    public DogServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public List<Dog> retrieveDogs() {
        return dogRepository.findAll();
    }

    @Override
    public List<String> retrieveDogBreeds() {
        return dogRepository.retrieveDogBreeds();
    }

    @Override
    public String retrieveDogBreedById(Long id) {
        Optional<String> optionalBreed = Optional.ofNullable(dogRepository.retrieveDogBreedById(id));
        String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
        return breed;
    }

    @Override
    public List<String> retrieveDogNames() {
        return dogRepository.retrieveDogNames();
    }
}
