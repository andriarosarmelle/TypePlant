package com.example.type_plant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.type_plant.model.Plante;
import com.example.type_plant.service.PlanteService;
@Controller
@RequestMapping("/plantes")
public class PlanteController {
    @Autowired
    private PlanteService planteService;

    @GetMapping
    public String listPlantes(Model model) {
        model.addAttribute("plantes", planteService.getAllPlantes());
        return "plantes/list";  
    }

    @GetMapping("/new")    
    public String newPlanteForm(Model model) {
        model.addAttribute("plante", new Plante());
        return "plantes/form";  
    }

    @PostMapping
    public String savePlante(@ModelAttribute Plante plante) {
        planteService.savePlante(plante);
        return "redirect:/plantes";
    }

    @GetMapping("/edit/{id}")
    public String editPlanteForm(@PathVariable Long id, Model model) {
        model.addAttribute("plante", planteService.getPlanteById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid plant ID: " + id)));
        return "plantes/form";  
    }

    @GetMapping("/delete/{id}")
    public String deletePlante(@PathVariable Long id) {
        planteService.deletePlante(id);
        return "redirect:/plantes";
    }
}