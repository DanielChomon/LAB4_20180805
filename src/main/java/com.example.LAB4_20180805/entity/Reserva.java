package com.example.LAB4_20180805.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
@Entity
@Getter
@Setter
@Table(name="Reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ReservaID")
    private int id;

    @Column(nullable = false)
    private Float precio_total;

    @Column(nullable = false)
    private String estadopago;

    @Column(nullable = false)
    private Date fecha_reserva;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "VueloID")
    private Vuelo vuelo;

}