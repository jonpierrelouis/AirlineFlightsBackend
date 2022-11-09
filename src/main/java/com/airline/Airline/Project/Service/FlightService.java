package com.airline.Airline.Project.Service;

import com.airline.Airline.Project.Models.City;
import com.airline.Airline.Project.Models.Flight;
import com.airline.Airline.Project.Repository.FlightRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlightService {
    FlightRepository fr;

    public FlightService(FlightRepository fr) {
        this.fr = fr;
    }

    public List<Flight> findAllFlightsByCities(int id1, int id2) {
        return fr.findAllFlightsByCities(id1, id2);
    }

    public List<Flight> findFlightsByDepartingCity(int id) {
        return fr.findFlightsByDepartingCity(id);
    }
}
