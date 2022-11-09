package com.airline.Airline.Project.Controller;

import com.airline.Airline.Project.Models.City;
import com.airline.Airline.Project.Models.Flight;
import com.airline.Airline.Project.Service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FlightController {
    private final FlightService fs;

    public FlightController(FlightService fs) {
        this.fs = fs;
    }

    @PostMapping("/flights")
    public List<Flight> findAllFlightsByCities(@RequestBody List<City> cities) {
        return fs.findAllFlightsByCities(cities);
    }

    @PostMapping("flights/departing")
    public List<Flight> findFlightsByDepartingCity(@RequestBody City city) {
        return fs.findFlightsByDepartingCity(city);
    }
}
