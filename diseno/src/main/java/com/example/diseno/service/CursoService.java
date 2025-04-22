package com.example.diseno.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.diseno.entity.Curso;
import com.example.diseno.repository.CursoRepository;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> getAllCurso() { return cursoRepository.findAll(); }
    public Optional<Curso> getCursoById(int id) { return cursoRepository.findById(id); }
    public void insertOrUpdateCurso(Curso curso) { cursoRepository.save(curso); }
    public void deleteCurso(int id) { cursoRepository.deleteById(id); }
}
