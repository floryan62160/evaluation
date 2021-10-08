package com.example.evaluation.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Infirmiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "adresse_id",nullable = false)
    private Integer adresse;

    @Column(name = "numero_professionnel",nullable = false)
    private Integer numeroProfessionel;

    @Column(name = "nom",nullable = false)
    private String nom;

    @Column(name = "prenom",nullable = false)
    private String prenom;

    @Column(name = "tel_pro",nullable = false)
    private Integer telPro;

    @Column(name = "tel_perso", nullable = true)
    private Integer telPerso;

    /*
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id",referencedColumnName = "id")
    private List<Patient> patientList;
     */
}
