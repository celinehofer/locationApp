package com.bharath.location.service;

import com.bharath.location.entities.Location;
import com.bharath.location.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service /* die Funktionen vom jpa repository können damit genutzt werden, stellt CRUD Methode zur Verfügung. save, delete, get. Danach controllers */
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository repository;

    @Override
    public Location saveLocation(Location location) {
        return repository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return repository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        repository.delete(location);
    }

    @Override
    public Location getLocationById(int id) {
        return repository.getOne(id);
    }

    @Override
    public List<Location> getAllLocations() {
        return null;
    }
}
