package com.muditasoft.springbootrestfullapis.repository;

import com.muditasoft.springbootrestfullapis.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {
}
