package com.muditasoft.springbootrestfullapis.repository;

import com.muditasoft.springbootrestfullapis.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
