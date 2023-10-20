package com.example.demo.service;

import com.example.demo.entity.Administrateur;
import com.example.demo.formulaire.AdministrateurForm;
import com.example.demo.formulaire.LoginForm;
import com.example.demo.repository.AdministrateurRepository;
import org.springframework.stereotype.Service;

@Service
public class AdministrateurService {
    private final AdministrateurRepository administrateurRepository;

    public AdministrateurService(AdministrateurRepository administrateurRepository) {
        this.administrateurRepository = administrateurRepository;
    }
    public void insererAdministrateur(AdministrateurForm administrateurForm){
        Administrateur administrateur = new Administrateur(administrateurForm.getNom(), administrateurForm.getPrenom(), administrateurForm.getMatricule(), administrateurForm.getMotDePasse());
        this.administrateurRepository.save(administrateur);
    }
    public Administrateur obtenirAdministrateurByMatricule(String matricule){
        return this.administrateurRepository.getAdministrateurByMatricule(matricule);
    }
    public void supprimerAdministrateur(String matricule){
        this.administrateurRepository.deleteAdministrateurByMatricule(matricule);
    }
    public void updateAdministrateur(AdministrateurForm administrateurForm) {
        Administrateur administrateur = (Administrateur) this.administrateurRepository.getAdministrateurByMatricule(administrateurForm.getMatricule());
        administrateur = new Administrateur(administrateurForm.getNom(), administrateurForm.getPrenom(), administrateurForm.getMatricule(), administrateurForm.getMotDePasse());
        this.administrateurRepository.save(administrateur);
    }
    public Administrateur authentificationAdministrateur(LoginForm loginForm) throws Exception {
        Administrateur administrateur = new Administrateur();
        administrateur.setMatricule(loginForm.getMatricule());
        administrateur.setMotDePasse(loginForm.getMotDePasse());
        //administrateur = administrateurRepository.findAll(administrateur);
        if(!administrateur.equals(null)) throw new Exception("No user found.");
        return  administrateur;
    }
}
