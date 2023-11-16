package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Administrateur {

    String nom;
    String prenom;
    @Id
    String matricule;
    @Column(name = "mot_de_passe")
    String motDePasse;

    public Administrateur(String nom, String prenom, String matricule, String motDePasse) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setMatricule(matricule);
        this.setMotDePasse(motDePasse);
    }

    public Administrateur() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(nom.isEmpty()) throw new NullPointerException("Nom invalide.");
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        if(prenom.isEmpty()) throw new NullPointerException("Prénom invalide.");
        this.prenom = prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        if(matricule.isEmpty()) throw new NullPointerException("Matricule invalide.");
        this.matricule = matricule;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        if(motDePasse.isEmpty() || motDePasse.length() < 5) throw new IllegalArgumentException("Mot de passe court ou pas vide.");
        this.motDePasse = motDePasse;
    }
}
