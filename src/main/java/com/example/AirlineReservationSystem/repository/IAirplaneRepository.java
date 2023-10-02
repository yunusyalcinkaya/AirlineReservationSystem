package com.example.AirlineReservationSystem.repository;

import com.example.AirlineReservationSystem.entities.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IAirplaneRepository extends JpaRepository<UUID, Airplane> {
}
