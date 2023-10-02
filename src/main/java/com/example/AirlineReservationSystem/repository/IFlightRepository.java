package com.example.AirlineReservationSystem.repository;

import com.example.AirlineReservationSystem.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface IFlightRepository extends JpaRepository<Flight, UUID> {
}
