package com.example.demo.formulaire;

public class LoginForm {
    String matricule;
    String motDePasse;

    public LoginForm(String matricule, String motDePasse) {
        this.setMatricule(matricule);
        this.setMotDePasse(motDePasse);
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
