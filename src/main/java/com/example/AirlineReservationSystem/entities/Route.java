package com.example.AirlineReservationSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name="routes")
@AllArgsConstructor
@NoArgsConstructor
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "take_of_point_airport_id")
    private Airport takeOfPoint;

    @ManyToOne
    @JoinColumn(name = "land_of_point_airport_id")
    private Airport landOfPoint;
}
