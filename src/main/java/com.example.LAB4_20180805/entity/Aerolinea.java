package com.example.LAB4_20180805.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Aerolinea")
public class Aerolinea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AerolineaID")
    private int id;

    @Column(nullable = false)
    private String nombre;
    private String codigo;

}