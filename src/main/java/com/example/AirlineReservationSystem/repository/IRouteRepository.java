package com.example.AirlineReservationSystem.repository;

import com.example.AirlineReservationSystem.entities.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;


public interface IRouteRepository extends JpaRepository<Route, UUID> {

    @Query(value = "select point.code from Route route join route.landOfPoint point")
    public List<String> findRoutes();
}
