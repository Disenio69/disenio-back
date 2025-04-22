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

import com.example.diseno.entity.Unidades;
import com.example.diseno.service.UnidadesService;

@RestController
@RequestMapping("api/v1/unidades")
public class UnidadesController {
    @Autowired
    private UnidadesService unidadesService;

    @GetMapping public List<Unidades> getAll() { return unidadesService.getAllUnidades(); }
    @GetMapping("/{id}") public Optional<Unidades> getById(@PathVariable int id) { return unidadesService.getUnidadesById(id); }
    @PostMapping public Unidades create(@RequestBody Unidades unidad) { unidadesService.insertOrUpdateUnidades(unidad); return unidad; }
    @DeleteMapping("/{id}") public void delete(@PathVariable int id) { unidadesService.deleteUnidades(id); }
}