package com.example.evaluation.services;

import com.example.evaluation.models.Infirmiere;
import com.example.evaluation.repositories.InfirmiereRepository;

import java.util.List;
import java.util.Optional;

public class InfirmiereServiceImpl implements InfirmiereService{
    private InfirmiereRepository infirmiereRepository;

    public InfirmiereServiceImpl(InfirmiereRepository infirmiereRepository) {
        this.infirmiereRepository = infirmiereRepository;
    }


    @Override
    public List<Infirmiere> findAll() {
        return this.infirmiereRepository.findAll();
    }

    @Override
    public Optional<Infirmiere> findById(Integer id) {
        return this.infirmiereRepository.findById(id);
    }

    @Override
    public Infirmiere saves(Infirmiere infirmiere) {
        return this.infirmiereRepository.save(infirmiere);
    }

    @Override
    public Infirmiere update(Infirmiere infirmiere) {
        return this.infirmiereRepository.save(infirmiere);
    }

    @Override
    public void delete(Integer id) {
        this.infirmiereRepository.deleteById(id);
    }

    public List<Infirmiere> findByTelPersoIsNull(){
        return this.infirmiereRepository.findByTelPersoIsNull();
    }
}
