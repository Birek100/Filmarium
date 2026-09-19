package com.filmarium.backend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cinema_halls")
public class CinemaHall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String screenType;
    private String seats;



}
