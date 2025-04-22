package com.example.diseno.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.diseno.entity.Mensaje;
import com.example.diseno.repository.MensajeRepository;


@Service
public class MensajeService {
    @Autowired
    private MensajeRepository mensajeRepository;

    public List<Mensaje> getAllMensaje() { return mensajeRepository.findAll(); }
    public Optional<Mensaje> getMensajeById(int id) { return mensajeRepository.findById(id); }
    public void insertOrUpdateMensaje(Mensaje mensaje) { mensajeRepository.save(mensaje); }
    public void deleteMensaje(int id) { mensajeRepository.deleteById(id); }
}
