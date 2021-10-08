package com.example.evaluation.controllers;

import com.example.evaluation.models.Infirmiere;
import com.example.evaluation.services.InfirmiereService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("infirmiere")
@CrossOrigin
public class InfirmiereController {
    private InfirmiereService infirmiereService;

    public InfirmiereController(InfirmiereService infirmiereService) {
        this.infirmiereService = infirmiereService;
    }

    @GetMapping
    public List<Infirmiere> findAll(){
        return this.infirmiereService.findAll();
    }
    @GetMapping("telPersoNull")
    public List<Infirmiere> findByTelPersoIsNull(){
        return this.infirmiereService.findByTelPersoIsNull();
    }

    @GetMapping("{id}")
    public Optional<Infirmiere> findById(@PathVariable Integer id){
        return this.infirmiereService.findById(id);
    }

    @PostMapping
    public Infirmiere saves(@RequestBody Infirmiere infirmiere){
        return this.infirmiereService.saves(infirmiere);
    }

    @PutMapping
    public Infirmiere update(@RequestBody Infirmiere infirmiere){
        return this.infirmiereService.update(infirmiere);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        this.infirmiereService.delete(id);
    }

}
