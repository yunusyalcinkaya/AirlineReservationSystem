package com.example.AirlineReservationSystem.repository;

import com.example.AirlineReservationSystem.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IAirportRepository extends JpaRepository<Airport, UUID> {
}
