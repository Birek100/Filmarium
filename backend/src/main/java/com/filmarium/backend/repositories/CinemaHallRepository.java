package com.filmarium.backend.repositories;

import com.filmarium.backend.entities.CinemaHall;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CinemaHallRepository extends JpaRepository {
    Optional<CinemaHall> findById(Long id);
}
