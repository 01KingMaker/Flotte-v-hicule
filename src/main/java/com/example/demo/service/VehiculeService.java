package com.example.demo.service;

import com.example.demo.entity.Vehicule;
import com.example.demo.formulaire.VehiculeForm;
import com.example.demo.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculeService {
    private final VehiculeRepository vehiculeRepository;
    @Autowired
    public VehiculeService(VehiculeRepository vehiculeRepository){
        this.vehiculeRepository = vehiculeRepository;
    }
    public List<Vehicule> obtenirVehicule(){
        return vehiculeRepository.findAll();
    }
    public Vehicule obtenirVehiculeParMatricule(String matricule){
        return vehiculeRepository.findVehiculeByMatricule(matricule).get(0);
    }
    public List<Vehicule> obtenirListeVehicule(){
        return this.vehiculeRepository.findAll();
    }
    public void insererVehicule(VehiculeForm vehiculeForm){
        Vehicule vehicule = new Vehicule(vehiculeForm.getMatricule(), vehiculeForm.getMarque());
        this.vehiculeRepository.save(vehicule);
    }

    public void updateVehicule(VehiculeForm vehiculeForm) {
        Vehicule vehicule = (Vehicule) this.vehiculeRepository.findVehiculeByMatricule(vehiculeForm.getMatricule());
        vehicule.setMarque(vehiculeForm.getMarque());
        this.vehiculeRepository.save(vehicule);
    }
    public void deleteVehicule(String matricule){
        Vehicule vehicule = (Vehicule) this.vehiculeRepository.findVehiculeByMatricule(matricule);
        this.vehiculeRepository.delete(vehicule);
    }
}
