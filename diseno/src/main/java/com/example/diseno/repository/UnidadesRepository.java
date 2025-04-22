package com.example.diseno.repository;

import com.example.diseno.entity.Unidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadesRepository extends JpaRepository<Unidades, Integer> {}
