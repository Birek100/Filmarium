package com.filmarium.backend.repositories;

import com.filmarium.backend.entities.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ScreeningRepository extends JpaRepository <Screening, Long> {
    Optional <Screening> findById(Long id);
}
