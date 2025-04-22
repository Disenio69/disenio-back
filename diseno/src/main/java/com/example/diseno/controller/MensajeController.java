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

import com.example.diseno.entity.Mensaje;
import com.example.diseno.service.MensajeService;

@RestController
@RequestMapping("api/v1/mensaje")
public class MensajeController {
    @Autowired
    private MensajeService mensajeService;

    @GetMapping public List<Mensaje> getAll() { return mensajeService.getAllMensaje(); }
    @GetMapping("/{id}") public Optional<Mensaje> getById(@PathVariable int id) { return mensajeService.getMensajeById(id); }
    @PostMapping public Mensaje create(@RequestBody Mensaje mensaje) { mensajeService.insertOrUpdateMensaje(mensaje); return mensaje; }
    @DeleteMapping("/{id}") public void delete(@PathVariable int id) { mensajeService.deleteMensaje(id); }
}