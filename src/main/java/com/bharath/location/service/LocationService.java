package com.bharath.location.service;

import com.bharath.location.entities.Location;

import java.util.List;

public interface LocationService {

    Location saveLocation(Location location);
    Location updateLocation(Location location);
    void deleteLocation(Location location); /*void da nur delete und nichts zurückgegeben werden soll*/
    Location getLocationById(int id);
    List<Location> getAllLocations();

}
