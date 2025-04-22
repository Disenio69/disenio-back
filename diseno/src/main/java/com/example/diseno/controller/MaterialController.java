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

import com.example.diseno.entity.Material;
import com.example.diseno.service.MaterialService;

@RestController
@RequestMapping("api/v1/material")
public class MaterialController {
    @Autowired
    private MaterialService materialService;

    @GetMapping public List<Material> getAll() { return materialService.getAllMaterial(); }
    @GetMapping("/{id}") public Optional<Material> getById(@PathVariable int id) { return materialService.getMaterialById(id); }
    @PostMapping public Material create(@RequestBody Material material) { materialService.insertOrUpdateMaterial(material); return material; }
    @DeleteMapping("/{id}") public void delete(@PathVariable int id) { materialService.deleteMaterial(id); }
}