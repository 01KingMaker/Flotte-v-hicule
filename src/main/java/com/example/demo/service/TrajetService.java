package com.example.demo.service;

import com.example.demo.entity.Trajet;
import com.example.demo.entity.Vehicule;
import com.example.demo.formulaire.TrajetForm;
import com.example.demo.repository.TrajetRepository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class TrajetService {
    private final TrajetRepository trajetRepository;
    private final VehiculeService vehiculeService;
    public TrajetService(TrajetRepository trajetRepository, VehiculeService vehiculeService) {
        this.trajetRepository = trajetRepository;
        this.vehiculeService = vehiculeService;
    }
    public List<Trajet> obetenirTousLesTrajets(){
        return trajetRepository.findAll();
    }
    public void insererTrajet(TrajetForm trajet){

        Vehicule vehicule = (Vehicule) vehiculeService.obtenirVehiculeParMatricule(trajet.getMatricule());
        Trajet trajet1 = new Trajet(vehicule, trajet.getPkDepart(), trajet.getPkArrive(), new Timestamp(new Date().getTime()));
        this.trajetRepository.save(trajet1);
    }

    public void updateTrajet(TrajetForm trajetForm) {

    }

    public List<Trajet> obtenirTrajet(String matricule){
        Vehicule vehicule = new Vehicule();
        vehicule.setMatricule(matricule);
        vehicule = this.vehiculeService.obtenirVehiculeParMatricule(matricule);
        Trajet trajet = new Trajet();
        trajet.setVehicule(vehicule);
        return this.trajetRepository.getTrajetsByVehicule();
    }
}
