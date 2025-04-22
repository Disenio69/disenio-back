package com.example.diseno.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Examen")
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExamen;

    @Column(length = 150)
    private String descripcion;

    @Column(name = "Ruta_examen", length = 150)
    private String rutaExamen;

    @Column(precision = 2, scale = 1)
    private BigDecimal calificacion;

    // Relación con Curso
    @ManyToOne
    @JoinColumn(name = "Curso_idCurso")
    private Curso curso;

    // Relación con Alumno
    @ManyToOne
    @JoinColumn(name = "Alumno_idAlumno")
    private Alumno alumno;
}
