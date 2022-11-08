package com.airline.Airline.Project.Models;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Flights")
@Builder
@ToString
public class Flight {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flight_id;
    @Column
    private int departing_city_id;
    @Column
    private int arrival_city_id;
    @Column
    private String airline;
    @Column
    private int cost;
}
