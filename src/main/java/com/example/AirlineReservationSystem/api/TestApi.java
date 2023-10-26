package com.example.AirlineReservationSystem.api;

import com.example.AirlineReservationSystem.repository.IRouteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class TestApi {

    private final IRouteRepository routeRepository;

    @GetMapping
    public List<String> get(){
        List<String> response = routeRepository.findRoutes();
        return response;
    }
}
