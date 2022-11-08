package com.airline.Airline.Project.Controller;

import com.airline.Airline.Project.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CityController {
    private final CityService cs;

    @Autowired
    public CityController(CityService cs) {
        this.cs = cs;
    }
}
