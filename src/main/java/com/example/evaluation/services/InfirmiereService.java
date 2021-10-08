package com.example.evaluation.services;

import com.example.evaluation.models.Infirmiere;

import java.util.List;
import java.util.Optional;

public interface InfirmiereService {
    public List<Infirmiere> findAll();
    public Optional<Infirmiere> findById(Integer id);
    public Infirmiere saves(Infirmiere infirmiere);
    public Infirmiere update(Infirmiere infirmiere);
    public void delete(Integer id);
    public List<Infirmiere> findByTelPersoIsNull();
}
