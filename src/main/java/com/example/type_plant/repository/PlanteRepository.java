package com.example.type_plant.repository;

import com.example.type_plant.model.Plante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanteRepository extends JpaRepository<Plante, Long> {
    
}