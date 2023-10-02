package com.example.FlightReservationSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name="airports")
@AllArgsConstructor
@NoArgsConstructor
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String code;

    private String name;

    private String city;

    private String state;

    @OneToMany(mappedBy = "location")
    private List<Airplane> airplanes;

    @OneToMany(mappedBy = "takeOfPoint")
    private List<Route> takeOfPoints;

    @OneToMany(mappedBy = "landOfPoint")
    private List<Route> landOfPoints;
}
