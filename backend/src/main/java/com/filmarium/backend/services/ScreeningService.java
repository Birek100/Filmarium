package com.filmarium.backend.services;
import com.filmarium.backend.entities.Screening;
import com.filmarium.backend.repositories.ScreeningRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreeningService {
    private final ScreeningRepository screeningRepository;

    public ScreeningService(ScreeningRepository screeningRepository){
        this.screeningRepository = screeningRepository;
    }

    public List<Screening> getAllScreenings () {
        return screeningRepository.findAll();
    }
}
