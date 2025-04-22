package com.example.diseno.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.diseno.entity.Examen;
import com.example.diseno.repository.ExamenRepository;

@Service
public class ExamenService {
    @Autowired
    private ExamenRepository examenRepository;

    public List<Examen> getAllExamen() { return examenRepository.findAll(); }
    public Optional<Examen> getExamenById(int id) { return examenRepository.findById(id); }
    public void insertOrUpdateExamen(Examen examen) { examenRepository.save(examen); }
    public void deleteExamen(int id) { examenRepository.deleteById(id); }
}
