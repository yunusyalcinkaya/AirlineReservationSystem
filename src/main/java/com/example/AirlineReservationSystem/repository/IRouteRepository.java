package com.example.AirlineReservationSystem.repository;

import com.example.AirlineReservationSystem.entities.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IRouteRepository extends JpaRepository<UUID, Route> {
}
