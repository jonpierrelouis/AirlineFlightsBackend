package com.airline.Airline.Project.Service;

import com.airline.Airline.Project.Repository.CityRepository;
import org.springframework.stereotype.Component;

@Component
public class CityService {

    CityRepository cr;

    public CityService(CityRepository cr) {
        this.cr = cr;
    }
}
