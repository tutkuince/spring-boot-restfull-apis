package com.muditasoft.springbootrestfullapis.web;

import com.muditasoft.springbootrestfullapis.entity.Dog;
import com.muditasoft.springbootrestfullapis.service.DogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> getAllDogs() {
        List<Dog> dogList = dogService.retrieveDogs();
        return ResponseEntity.ok(dogList);
    }
}
