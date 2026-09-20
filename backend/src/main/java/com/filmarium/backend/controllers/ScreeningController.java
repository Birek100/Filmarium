package com.filmarium.backend.controllers;

import com.filmarium.backend.services.CinemaHallService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/screenings")
public class ScreeningController {
        private final CinemaHallService cinemaHallService;

        public ScreeningController(CinemaHallService cinemaHallService) {
            this.cinemaHallService = cinemaHallService;
        }
/*
        @GetMapping("/")

        @GetMapping

        @PostMapping

        @PatchMapping

        @DeleteMapping
*/

}



