package com.example.AirlineReservationSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "airplanes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private int numberOfSeats;

    private LocalDate manuFacturedDate;

    @ManyToOne
    @JoinColumn(name = "airplane_type_id")
    private AirplaneType type;

    @ManyToOne
    @JoinColumn(name = "airport_id")
    private Airport location;

    @ManyToOne
    @JoinColumn(name = "airline_company_id")
    private AirlineCompany airlineCompany;

    @OneToMany(mappedBy = "airplane")
    private List<Flight> flights;

}
