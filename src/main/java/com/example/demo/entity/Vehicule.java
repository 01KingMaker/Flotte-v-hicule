package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicule {
    @Id
    String matricule;
    @Column(name = "marque_vehicule")
    String marque;
    public Vehicule(){}
    public Vehicule(String marque, String matricule){
        this.marque = marque;
        this.matricule = matricule;
    }

    public String getMarque() {
        return marque;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMarque(String marque) {
        if(marque.isEmpty()) throw new NullPointerException("Marque invalide.");
        this.marque = marque;
    }

    public void setMatricule(String matricule) {
        if(matricule.isEmpty()) throw new NullPointerException("Matricule invalide");
        this.matricule = matricule;
    }
}
