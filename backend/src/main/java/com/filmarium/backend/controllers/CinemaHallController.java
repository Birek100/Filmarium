package com.filmarium.backend.controllers;

import com.filmarium.backend.services.CinemaHallService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cinema-halls")
public class CinemaHallController {
    private final CinemaHallService cinemaHallService;

    public CinemaHallController(CinemaHallService cinemaHallService) {
        this.cinemaHallService = cinemaHallService;
    }
/*
    @GetMapping

    @GetMapping

    @PostMapping

    @PatchMapping

    @DeleteMapping

*/
}
