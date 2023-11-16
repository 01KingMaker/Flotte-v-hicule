package com.example.demo.entity;

public class Livre {

    String nom;
    int numero;
  
    public Livre(){
  
    }
    public Livre(String nom, int numero){
        this.setNom(nom);
        this.setNumero(numero);

    
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
   
}
