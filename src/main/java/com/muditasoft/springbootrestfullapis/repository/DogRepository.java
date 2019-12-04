package com.muditasoft.springbootrestfullapis.repository;

import com.muditasoft.springbootrestfullapis.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DogRepository extends JpaRepository<Dog, Long> {
    @Query("select d.id, d.breed from Dog d")
    List<String> retrieveDogBreeds();

    @Query("select d.id, d.breed from Dog d where d.id=:id")
    String retrieveDogBreedById(Long id);

    @Query("select d.id, d.name from Dog d")
    List<String> retrieveDogNames();
}
