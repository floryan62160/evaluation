package com.example.evaluation.repositories;

import com.example.evaluation.models.Infirmiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InfirmiereRepository extends JpaRepository<Infirmiere, Integer> {
    @Query(value = "SELECT infirmiere FROM Infirmiere infirmiere WHERE infirmiere.telPerso IS NULL")
    public List<Infirmiere> findByTelPersoIsNull();
}
