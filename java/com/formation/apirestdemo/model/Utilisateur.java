package com.formation.apirestdemo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "utilisateurs")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Le nom de l'utilisateur est obligatoire")
    private String nom;

    @NotBlank(message = "Le prénom de l'utilisateur est obligatoire")
    private String prenom;

    @NotBlank(message = "L'email de l'utilisateur est obligatoire")
    @Column(unique = true)
    private String email;

    @Positive(message = "L'âge doit être un nombre positif")
    private String age;

    public Long getId() {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
