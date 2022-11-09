package com.airline.Airline.Project.Repository;

import com.airline.Airline.Project.Models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

    @Query(
            value = "select * from flights where departing_city_id = ?1 and arrival_city_id = ?2",
            nativeQuery = true
    )
    List<Flight> findAllFlightsByCities(int departing_city_id, int arrival_city_id);

    @Query(
            value = "select * from flights where departing_city_id = ?1",
            nativeQuery = true
    )
    List<Flight> findFlightsByDepartingCity(int departing_city_id);
}
