package com.muditasoft.springbootrestfullapis.web;

import com.muditasoft.springbootrestfullapis.entity.Dog;
import com.muditasoft.springbootrestfullapis.service.DogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dogs")
public class DogController {

    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("")
    public ResponseEntity<List<Dog>> getAllDogs() {
        List<Dog> dogList = dogService.retrieveDogs();
        return ResponseEntity.ok(dogList);
    }

    @GetMapping("/breeds")
    public ResponseEntity<List<String>> getAllDogBreeds() {
        List<String> dogBreeds = dogService.retrieveDogBreeds();
        return ResponseEntity.ok(dogBreeds);
    }

    @GetMapping("/breeds/{id}")
    public ResponseEntity<String> getDogBreedById(@PathVariable Long id) {
        String dogBreedById = dogService.retrieveDogBreedById(id);
        return ResponseEntity.ok(dogBreedById);
    }

    @GetMapping("/names")
    public ResponseEntity<List<String>> getAllDogNames() {
        List<String> dogNames = dogService.retrieveDogNames();
        return ResponseEntity.ok(dogNames);
    }
}
