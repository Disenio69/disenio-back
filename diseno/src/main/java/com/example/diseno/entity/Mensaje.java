package com.example.diseno.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Mensaje")
public class Mensaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_mensaje;

    @Column(name = "Fecha_envio")
    private LocalDateTime fechaEnvio;

    @Column(length = 300)
    private String contenido;

    @Column(length = 45)
    private String asunto;

    // Relación recursiva
    @ManyToOne
    @JoinColumn(name = "Respuesta")
    private Mensaje respuesta;

    // Relación con Foro
    @ManyToOne
    @JoinColumn(name = "Foro_foroId")
    private Foro foro;

    // Relación con Personal
    @ManyToOne
    @JoinColumn(name = "Personal_idPersonal")
    private Personal personal;

    // Relación con Alumno
    @ManyToOne
    @JoinColumn(name = "Alumno_idAlumno")
    private Alumno alumno;

    @Column(length = 300)
    private String rutaArchivo;
}