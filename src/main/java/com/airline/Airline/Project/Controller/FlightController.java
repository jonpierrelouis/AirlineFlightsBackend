package com.airline.Airline.Project.Controller;

import com.airline.Airline.Project.DTOs.FlightForList;
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

    @GetMapping("/flights/{id1}/{id2}")
    public List<FlightForList> findAllFlightsByCities(@PathVariable("id1") int id1, @PathVariable("id2") int id2) {
        return fs.findAllFlightsByCities(id1, id2);
    }

    @GetMapping("flights/departing/{id}")
    public List<FlightForList> findFlightsByDepartingCity(@PathVariable("id") int id) {
        return fs.findFlightsByDepartingCity(id);
    }
}
