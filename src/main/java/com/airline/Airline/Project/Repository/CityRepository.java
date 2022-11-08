package com.airline.Airline.Project.Repository;

import com.airline.Airline.Project.Models.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository <City, Integer> {
}
