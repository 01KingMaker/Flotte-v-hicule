package com.example.demo.formulaire;

public class TrajetForm {
    String matricule;
    int pkDepart;
    int pkArrive;
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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
}
