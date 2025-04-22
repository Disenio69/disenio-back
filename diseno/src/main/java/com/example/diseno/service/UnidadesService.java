package com.example.diseno.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.diseno.entity.Unidades;
import com.example.diseno.repository.UnidadesRepository;

@Service
public class UnidadesService {
    @Autowired
    private UnidadesRepository unidadesRepository;

    public List<Unidades> getAllUnidades() { return unidadesRepository.findAll(); }
    public Optional<Unidades> getUnidadesById(int id) { return unidadesRepository.findById(id); }
    public void insertOrUpdateUnidades(Unidades unidad) { unidadesRepository.save(unidad); }
    public void deleteUnidades(int id) { unidadesRepository.deleteById(id); }
}
