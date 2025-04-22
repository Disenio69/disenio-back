package com.example.diseno.repository;

import com.example.diseno.entity.Foro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForoRepository extends JpaRepository<Foro, Integer> {}
