package com.filmarium.backend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "reserved_seats")
public class ReservedSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Seat seat;
    @ManyToOne
    private Screening screening;

    public ReservedSeat() {
    }
}
