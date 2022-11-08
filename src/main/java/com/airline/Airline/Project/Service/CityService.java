package com.airline.Airline.Project.Service;

import com.airline.Airline.Project.Models.City;
import com.airline.Airline.Project.Repository.CityRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityService {

    CityRepository cr;

    public CityService(CityRepository cr) {
        this.cr = cr;
    }

    public List<City> getAllCities() {
        List<City> cities = cr.findAll();
        return cities;
    }
}
