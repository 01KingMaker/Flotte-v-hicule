package com.example.demo.controller;

import com.example.demo.entity.Vehicule;
import com.example.demo.formulaire.VehiculeForm;
import com.example.demo.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Vehicule")
public class VehiculeController {
    private final VehiculeService vehiculeService;

    @Autowired
    public VehiculeController(VehiculeService vehiculeService){
        this.vehiculeService = vehiculeService;
    }

    @GetMapping("/{matricule}")
    public Vehicule Vehicule(@PathVariable String matricule){
        return vehiculeService.obtenirVehiculeParMatricule(matricule);
    }

    @PostMapping()
    public void insererVehicule(@RequestBody VehiculeForm vehiculeForm){
        this.vehiculeService.insererVehicule(vehiculeForm);
    }

    @GetMapping
    public List<Vehicule> obtenirListeVehicule(){
        return this.vehiculeService.obtenirListeVehicule();
    }

    @PutMapping
    public void updateVehicule(@RequestBody VehiculeForm vehiculeForm){
        this.vehiculeService.updateVehicule(vehiculeForm);
    }
    @DeleteMapping("/{matricule}")
    public void deleteVehicule(@PathVariable String matricule){
        this.vehiculeService.deleteVehicule(matricule);
    }
}
