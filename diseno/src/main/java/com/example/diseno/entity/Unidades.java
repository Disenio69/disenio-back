package com.example.diseno.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Unidades")
public class Unidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // Campo generado si querés una PK técnica. Si no, se puede usar clave compuesta.

    @ManyToOne
    @JoinColumn(name = "Curso_idCurso")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "Alumno_idAlumno")
    private Alumno alumno;
}