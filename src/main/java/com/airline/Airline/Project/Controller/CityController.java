package com.airline.Airline.Project.Controller;

import com.airline.Airline.Project.Models.City;
import com.airline.Airline.Project.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins ="*")
public class CityController {
    private final CityService cs;

    @Autowired
    public CityController(CityService cs) {
        this.cs = cs;
    }

    @GetMapping("/cities")
    public List<City> getAllCities() {
        List<City> cities = cs.getAllCities();
        return cities;
    }

    public Optional<City> getCityById(int id) {
        return cs.getCityById(id);
    }
}
