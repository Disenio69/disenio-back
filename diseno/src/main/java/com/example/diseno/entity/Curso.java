package com.example.diseno.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Date;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Curso")

public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;

    @Column(length = 45, nullable = false)
    private String nombre;

    @Column(length = 20)
    private String gradoAcademico;

    @Column(length = 100)
    private String descripcion;

    @Column(length = 45)
    private String cantidadMaterias;

    @Column(length = 45)
    private String duracion;

    // Relaciones con Personal (suponiendo entidad Personal ya existente)
    @ManyToOne
    @JoinColumn(name = "Personal_idPersonal")
    private Personal personal;
}