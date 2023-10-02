package com.example.AirlineReservationSystem.repository;

import com.example.AirlineReservationSystem.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IReservationRepository extends JpaRepository <UUID, Reservation> {

}
