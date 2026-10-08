package com.filmarium.backend.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal price;
    @OneToOne
    private ReservedSeat reservedSeat;
    @ManyToOne
    private Order order;


    public Ticket() {
    }
}
