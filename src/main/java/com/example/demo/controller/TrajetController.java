package com.example.demo.controller;

import com.example.demo.entity.Trajet;
import com.example.demo.formulaire.TrajetForm;
import com.example.demo.service.TrajetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Trajet")
public class TrajetController {

    private final TrajetService trajetService;

    @Autowired
    public TrajetController(TrajetService trajetService){
        this.trajetService = trajetService;
    }

    @PostMapping
    public void insererTrajet(@RequestBody TrajetForm trajetForm){
        this.trajetService.insererTrajet(trajetForm);
    }
    @PutMapping
    public void updateTrajet(@RequestBody TrajetForm trajetForm){
        this.trajetService.updateTrajet(trajetForm);
    }
    @GetMapping("/{matricule}")
    public List<Trajet> obtenirTrajet(@PathVariable String matricule) throws NoSuchMethodException {
        throw new NoSuchMethodException("Not available now");
    }
}
