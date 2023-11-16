package com.example.demo.controller;

import com.example.demo.entity.Administrateur;
import com.example.demo.formulaire.AdministrateurForm;
import com.example.demo.formulaire.LoginForm;
import com.example.demo.service.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Administrateur")
public class AdministratorController {
    private final AdministrateurService administrateurService;

    @Autowired
    public AdministratorController(AdministrateurService administrateurService) { this.administrateurService = administrateurService; }

    @PostMapping
    public void insiderAdministrator(@PathVariable AdministrateurForm administrateurForm){
        this.administrateurService.insererAdministrateur(administrateurForm);
    }
    @GetMapping("/{matricule}")
    public Administrateur obtenirAdministrator(@PathVariable String matricule){
        return this.administrateurService.obtenirAdministrateurByMatricule(matricule);
    }
    @DeleteMapping("/{matricule}")
    public void deleterAdministrator(@PathVariable String matricule){
        this.administrateurService.supprimerAdministrateur(matricule);
    }
    @PutMapping
    public void updateAdministrator(@RequestBody AdministrateurForm administrateurForm){
        this.updateAdministrator(administrateurForm);
    }
    @PostMapping
    public Administrateur authentificateAdministrator(@RequestBody LoginForm loginForm) throws Exception {
        return this.administrateurService.authentificationAdministrateur(loginForm);
    }
}
