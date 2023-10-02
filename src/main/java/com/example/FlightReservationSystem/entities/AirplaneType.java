package com.example.FlightReservationSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "airplane_types")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AirplaneType {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String typeName;

    private int maxCapacity;

    private String manuFacturedBy;

    @OneToMany(mappedBy = "type")
    private List<Airplane> airplanes;
}
