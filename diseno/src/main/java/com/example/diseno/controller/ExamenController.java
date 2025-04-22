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

import com.example.diseno.entity.Examen;
import com.example.diseno.service.ExamenService;

@RestController
@RequestMapping("api/v1/examen")
public class ExamenController {
    @Autowired
    private ExamenService examenService;

    @GetMapping public List<Examen> getAll() { return examenService.getAllExamen(); }
    @GetMapping("/{id}") public Optional<Examen> getById(@PathVariable int id) { return examenService.getExamenById(id); }
    @PostMapping public Examen create(@RequestBody Examen examen) { examenService.insertOrUpdateExamen(examen); return examen; }
    @DeleteMapping("/{id}") public void delete(@PathVariable int id) { examenService.deleteExamen(id); }
}