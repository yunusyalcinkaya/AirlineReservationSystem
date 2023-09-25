package com.example.FlightReservationSystem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "airplane")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Plane {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "no")
    private int no;
}
