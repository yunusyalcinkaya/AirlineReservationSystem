package com.example.AirlineReservationSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "airline_companies")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AirlineCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String contactPhone;

    private String contactEmail;

    @OneToMany(mappedBy = "airlineCompany")
    private List<Airplane> airplanes;
}
