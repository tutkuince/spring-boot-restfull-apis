package com.muditasoft.springbootrestfullapis.web;

import com.muditasoft.springbootrestfullapis.entity.Location;
import com.muditasoft.springbootrestfullapis.service.LocationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/locations")
    public ResponseEntity<List<Location>> getAllLocations() {
        List<Location> locationList = locationService.retrieveLocations();
        return ResponseEntity.ok(locationList);
    }
}
