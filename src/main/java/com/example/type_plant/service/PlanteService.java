package com.example.type_plant.service;

import com.example.type_plant.repository.PlanteRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.type_plant.model.Plante;
import java.util.List;
import java.util.Optional;


@Service

public class PlanteService {
    @Autowired
    private PlanteRepository planteRepository;

    public List<Plante> getAllPlantes() {
        return planteRepository.findAll();
    }

    public Optional<Plante> getPlanteById(Long id) {
        return planteRepository.findById(id);
    }

    public Plante savePlante(Plante plante) {
        return planteRepository.save(plante);
    }

    public void deletePlante(Long id) {
        planteRepository.deleteById(id);
    }
    

}
