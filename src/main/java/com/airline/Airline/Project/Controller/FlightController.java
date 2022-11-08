package com.airline.Airline.Project.Controller;

import com.airline.Airline.Project.Service.FlightService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class FlightController {
    private final FlightService fs;

    public FlightController(FlightService fs) {
        this.fs = fs;
    }
}
