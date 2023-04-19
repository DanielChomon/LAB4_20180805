package com.example.LAB4_20180805.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter
@Setter
@Table(name="Vuelos")
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="VueloID")
    private int id;

    @Column(nullable = false)
    private String origen;
    private String destino;
    private Date fecha_salida;
    private Date fecha_llegada;
    private int duracion;
    private Float precio;

    @ManyToOne
    @JoinColumn(name = "AerolineaID")
    private Aerolinea aerolinea;

    @Column(nullable = false)
    private int asientos_disponibles;
    private String descripcion;


}