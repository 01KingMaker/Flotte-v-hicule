package com.example.demo.repository;


import com.example.demo.entity.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrajetRepository extends JpaRepository<Trajet, String> {
    public List<Trajet> getTrajetsByVehicule();
}
