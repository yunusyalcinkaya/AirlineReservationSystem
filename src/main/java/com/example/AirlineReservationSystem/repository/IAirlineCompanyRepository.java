package com.example.AirlineReservationSystem.repository;

import com.example.AirlineReservationSystem.entities.AirlineCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IAirlineCompanyRepository extends JpaRepository <UUID, AirlineCompany> {

}
