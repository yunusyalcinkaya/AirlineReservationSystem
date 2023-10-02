package com.example.FlightReservationSystem.entities;

import com.example.FlightReservationSystem.entities.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name="pessengers")
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private Gender gender;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    private String nationality;

    private String phone;

    private String email;

    @OneToMany(mappedBy = "passenger")
    private List<Reservation> reservations;
}
