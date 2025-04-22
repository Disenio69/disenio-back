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

import com.example.diseno.entity.Foro;
import com.example.diseno.service.ForoService;

@RestController
@RequestMapping("api/v1/foro")
public class ForoController {
    @Autowired
    private ForoService foroService;

    @GetMapping public List<Foro> getAll() { return foroService.getAllForo(); }
    @GetMapping("/{id}") public Optional<Foro> getById(@PathVariable int id) { return foroService.getForoById(id); }
    @PostMapping public Foro create(@RequestBody Foro foro) { foroService.insertOrUpdateForo(foro); return foro; }
    @DeleteMapping("/{id}") public void delete(@PathVariable int id) { foroService.deleteForo(id); }
}