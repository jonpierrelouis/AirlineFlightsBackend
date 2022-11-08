package com.airline.Airline.Project.Service;

import com.airline.Airline.Project.Repository.FlightRepository;
import org.springframework.stereotype.Component;

@Component
public class FlightService {
    FlightRepository fr;

    public FlightService(FlightRepository fr) {
        this.fr = fr;
    }

}
