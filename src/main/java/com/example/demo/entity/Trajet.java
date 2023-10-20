package com.example.demo.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Trajet {
    @Id
    String idTrajet;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "matricule")
    Vehicule vehicule;

    int pkDepart;
    int pkArrive;
    Timestamp date;

    public Trajet(){

    }
    public Trajet(Vehicule vehicule, int pkDepart, int pkArrive, Timestamp date) {
        this.vehicule = vehicule;
        this.pkDepart = pkDepart;
        this.pkArrive = pkArrive;
        this.date = date;
    }

    public String getIdTrajet() {
        return idTrajet;
    }

    public void setIdTrajet(String idTrajet) {
        this.idTrajet = idTrajet;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public int getPkDepart() {
        return pkDepart;
    }

    public void setPkDepart(int pkDepart) {
        this.pkDepart = pkDepart;
    }

    public int getPkArrive() {
        return pkArrive;
    }

    public void setPkArrive(int pkArrive) {
        this.pkArrive = pkArrive;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
