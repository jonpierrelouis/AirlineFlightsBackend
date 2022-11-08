package com.airline.Airline.Project.Repository;

import com.airline.Airline.Project.Models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
