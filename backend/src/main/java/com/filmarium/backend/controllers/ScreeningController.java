package com.filmarium.backend.controllers;

import com.filmarium.backend.services.ScreeningService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/screenings")
public class ScreeningController {
        private final ScreeningService screeningService;

        public CinemaHallController(ScreeningService screeningService) {
            this.screeningService = screeningService;
        }

        @GetMapping

        @GetMapping

        @PostMapping

        @PatchMapping

        @DeleteMapping


}



