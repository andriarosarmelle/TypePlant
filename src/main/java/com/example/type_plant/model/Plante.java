package com.example.type_plant.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name="Plante")
@Data
public class Plante {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable= false)
    private String nom;

    @Column(nullable= false)
    private String couleurs;

   

    @Column(nullable= false)
    private Integer nombre;

    @Column(name="periode_arrosage", nullable= false)
    private Integer periodeArrosage;
}
