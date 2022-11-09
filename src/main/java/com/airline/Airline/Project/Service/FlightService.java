package com.airline.Airline.Project.Service;

import com.airline.Airline.Project.Controller.CityController;
import com.airline.Airline.Project.DTOs.FlightForList;
import com.airline.Airline.Project.Models.City;
import com.airline.Airline.Project.Models.Flight;
import com.airline.Airline.Project.Repository.FlightRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class FlightService {
    FlightRepository fr;
    CityController cc;

    public FlightService(FlightRepository fr, CityController cc) {

        this.fr = fr;
        this.cc = cc;
    }

    public List<FlightForList> findAllFlightsByCities(int id1, int id2) {
        List<Flight> flights = fr.findAllFlightsByCities(id1, id2);
        List<FlightForList> listofflights = new ArrayList<>();
        for (int i = 0; i < flights.size(); i++) {
            City departing_city = cc.getCityById(flights.get(i).getDeparting_city_id()).get();
            City arrival_city = cc.getCityById(flights.get(i).getArrival_city_id()).get();
            FlightForList newflight = new FlightForList();
            newflight.setFlight_id(flights.get(i).getFlight_id());
            newflight.setArrival_city(arrival_city.getName());
            newflight.setDeparture_city(departing_city.getName());
            newflight.setAirline(flights.get(i).getAirline());
            newflight.setCost(flights.get(i).getCost());
            listofflights.add(newflight);
        }
        return listofflights;
    }

    public List<FlightForList> findFlightsByDepartingCity(int id) {
        List<Flight> flights = fr.findFlightsByDepartingCity(id);
        List<FlightForList> listofflights = new ArrayList<>();
        for (int i = 0; i < flights.size(); i++) {
            City departing_city = cc.getCityById(flights.get(i).getDeparting_city_id()).get();
            City arrival_city = cc.getCityById(flights.get(i).getArrival_city_id()).get();
            FlightForList newflight = new FlightForList();
            newflight.setFlight_id(flights.get(i).getFlight_id());
            newflight.setArrival_city(arrival_city.getName());
            newflight.setDeparture_city(departing_city.getName());
            newflight.setAirline(flights.get(i).getAirline());
            newflight.setCost(flights.get(i).getCost());
            listofflights.add(newflight);
        }
        return listofflights;
    }
}
