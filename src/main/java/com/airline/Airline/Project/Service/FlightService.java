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

    public List<Flight> findAllFlightsByCities(List<City> cities) {
        City departing_city = cities.remove(0);
        City arrival_city = cities.remove(0);
        return fr.findAllFlightsByCities(departing_city.getCity_id(),arrival_city.getCity_id());
    }
}
