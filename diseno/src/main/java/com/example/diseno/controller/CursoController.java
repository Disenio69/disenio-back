package com.example.diseno.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.diseno.entity.Curso;
import com.example.diseno.service.CursoService;

@RestController
@RequestMapping("api/v1/curso")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @GetMapping public List<Curso> getAll() { return cursoService.getAllCurso(); }
    @GetMapping("/{id}") public Optional<Curso> getById(@PathVariable int id) { return cursoService.getCursoById(id); }
    @PostMapping public Curso create(@RequestBody Curso curso) { cursoService.insertOrUpdateCurso(curso); return curso; }
    @DeleteMapping("/{id}") public void delete(@PathVariable int id) { cursoService.deleteCurso(id); }
}
