package com.example.AirlineReservationSystem.repository;

import com.example.AirlineReservationSystem.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


public interface IPassengerRepository extends JpaRepository<Passenger, UUID> {
}
