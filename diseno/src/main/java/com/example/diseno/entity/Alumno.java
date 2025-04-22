package com.example.diseno.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Date;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table (name = "alumno")

public class Alumno {
    //generacion de id autoincremental
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int dni;

    private String nombre;

    private String apellido;

    private String correo;

    private String contrasena= "1234";

    private String sexo;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date FechaNacimiento;

    private int horas;

    private String especialidad;

    private String Nacionalidad= "Arg";

    private String Domicilio= "asd";

    private String Usuario= "asdf";
}
