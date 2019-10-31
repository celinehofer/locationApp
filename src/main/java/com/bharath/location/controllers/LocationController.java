package com.bharath.location.controllers;

import com.bharath.location.entities.Location;
import com.bharath.location.repos.LocationRepository;
import com.bharath.location.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller /*somit weiss spring das dies der Controller ist.*/
public class LocationController {

    @Autowired
    LocationService service; /*Der Controller verwendet den Service*/

    @RequestMapping("/showCreate") /*somit weiss er was machen, wenn diese URL kommt. Unter applicationproperties sind der prefix udn suffix drin, so weiss er was er hinten dran fügen muss.*/
    public String showCreate() {
        return "createLocation";
    }

    @RequestMapping("/saveLoc") /*steht in der action im form, wann diese Funktion aufgerufen werden soll*/
    public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) { /*Mapping zwischen Objekt udn Daten -> @ModelAttribut("Location"), objekt wird in location reingespeichert. Mit ModelMap sagt man spring, dass er was/Antwort zurückgeben soll*/
        Location locationSaved = service.saveLocation(location);
        String msg = "Location saved with id: " + locationSaved.getId();
        modelMap.addAttribute("msg", msg);
        return "createLocation";
    }
}

/*Danach folgt nur noch das Frontend jsp */