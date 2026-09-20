package com.filmarium.backend.services;
import com.filmarium.backend.repositories.ScreeningRepository;
import org.springframework.stereotype.Service;

@Service
public class ScreeningService {
    private final ScreeningRepository screeningRepository;

    public ScreeningService(ScreeningRepository screeningRepository){
        this.screeningRepository = screeningRepository;
    }

}
