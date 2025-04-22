package com.example.diseno.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Date;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Foro")

public class Foro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int foroId;

    @Column(length = 150)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "Curso_idCurso")
    private Curso curso;
}