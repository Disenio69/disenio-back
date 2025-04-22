package com.example.diseno.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.diseno.entity.Personal;
import com.example.diseno.repository.PersonalRepository;

@Service
public class PersonalService {
    @Autowired
    private PersonalRepository personalRepository;

    public List<Personal> getAllPersonal() { return personalRepository.findAll(); }
    public Optional<Personal> getPersonalById(int id) { return personalRepository.findById(id); }
    public void insertOrUpdatePersonal(Personal personal) { personalRepository.save(personal); }
    public void deletePersonal(int id) { personalRepository.deleteById(id); }
}
