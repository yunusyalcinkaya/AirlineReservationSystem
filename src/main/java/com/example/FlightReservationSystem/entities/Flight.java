package com.example.FlightReservationSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name="flights")
@AllArgsConstructor
@NoArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String flightNumber;

    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @OneToMany(mappedBy = "flight")
    private List<Reservation> reservations;
}
