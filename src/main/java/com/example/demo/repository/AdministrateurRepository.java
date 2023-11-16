package com.example.demo.repository;

import com.example.demo.entity.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur, String> {
    public Administrateur getAdministrateurByMatricule(String matricule);
    public void deleteAdministrateurByMatricule(String matricule);
    //public Administrateur getAdministrateurByMatriculeAndMotDePasse();
}
