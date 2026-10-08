package com.filmarium.backend.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal totalPrice;
    private LocalDate purchaseDate;
    @ManyToOne
    private Screening screening;
    @ManyToOne
    private User user;

    public Order() {
    }
}

