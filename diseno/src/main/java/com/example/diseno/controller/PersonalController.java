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

import com.example.diseno.entity.Personal;
import com.example.diseno.service.PersonalService;

@RestController
@RequestMapping("api/v1/personal")
public class PersonalController {
    @Autowired
    private PersonalService personalService;

    @GetMapping public List<Personal> getAll() { return personalService.getAllPersonal(); }
    @GetMapping("/{id}") public Optional<Personal> getById(@PathVariable int id) { return personalService.getPersonalById(id); }
    @PostMapping public Personal create(@RequestBody Personal personal) { personalService.insertOrUpdatePersonal(personal); return personal; }
    @DeleteMapping("/{id}") public void delete(@PathVariable int id) { personalService.deletePersonal(id); }
}