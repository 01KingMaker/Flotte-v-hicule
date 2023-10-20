package com.example.demo.repository;

import com.example.demo.entity.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, String> {
    List<Vehicule> findVehiculeByMatricule(String matricule);
}