package com.muditasoft.springbootrestfullapis.service.impl;

import com.muditasoft.springbootrestfullapis.entity.Location;
import com.muditasoft.springbootrestfullapis.repository.LocationRepository;
import com.muditasoft.springbootrestfullapis.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> retrieveLocations() {
        return locationRepository.findAll();
    }
}
