package com.muditasoft.springbootrestfullapis.repository;

import com.muditasoft.springbootrestfullapis.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {
}
