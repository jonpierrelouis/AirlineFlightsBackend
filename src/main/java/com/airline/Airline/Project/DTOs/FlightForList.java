package com.airline.Airline.Project.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightForList {
    private int flight_id;
    private String departure_city;
    private String arrival_city;
    private String airline;
    private int cost;
}
