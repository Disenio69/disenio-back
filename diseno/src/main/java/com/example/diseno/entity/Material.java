package com.example.diseno.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int materialID;

    @Column(length = 45)
    private String observacion;

    @Column(precision = 2, scale = 1)
    private BigDecimal calificacion;

    @Column(name = "Ruta_archivo", length = 200)
    private String rutaArchivo;

    @Column(name = "FechaSubida")
    private LocalDateTime fechaSubida;

    // Relación con Curso
    @ManyToOne
    @JoinColumn(name = "Curso_idCurso")
    private Curso curso;

    // Relación con Mensaje
    @ManyToOne
    @JoinColumn(name = "Mensaje_id_mensaje")
    private Mensaje mensaje;
}
