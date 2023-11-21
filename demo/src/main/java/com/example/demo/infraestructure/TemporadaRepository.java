package com.example.demo.infraestructure;
import com.example.demo.domain.entities.Temporada;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TemporadaRepository extends JpaRepository<Temporada, Long> {
}
