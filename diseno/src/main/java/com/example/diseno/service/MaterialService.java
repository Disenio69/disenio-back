package com.example.diseno.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.diseno.entity.Material;
import com.example.diseno.repository.MaterialRepository;

@Service
public class MaterialService {
    @Autowired
    private MaterialRepository materialRepository;

    public List<Material> getAllMaterial() { return materialRepository.findAll(); }
    public Optional<Material> getMaterialById(int id) { return materialRepository.findById(id); }
    public void insertOrUpdateMaterial(Material material) { materialRepository.save(material); }
    public void deleteMaterial(int id) { materialRepository.deleteById(id); }
}
