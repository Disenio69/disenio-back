package com.example.diseno.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Date;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Personal")
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonal;

    @Column(length = 45)
    private String ocupacion;

    @Column(length = 45)
    private String nombre;

    @Column(length = 45)
    private String apellido;

    @Column(length = 45)
    private String usuario;

    @Column(length = 45)
    private String contrasena;

    @Column(length = 45)
    private String fechaNacimiento;

    @Column(length = 70)
    private String correo;

    @Column
    private int dni;

}// Getters y Setters

