package com.airline.Airline.Project.Models;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Cities")
@Builder
@ToString
public class City {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int city_id;
    @Column
    private String name;
}
