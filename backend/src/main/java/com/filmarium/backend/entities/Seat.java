package com.filmarium.backend.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "seats")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int positionY;
    private int positionX;
    private SeatType seatType;
    private int activeSeatId;
    @ManyToOne
    private CinemaHall cinemaHall;

    public Seat() {
    }
}
