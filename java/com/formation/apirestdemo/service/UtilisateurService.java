package com.formation.apirestdemo.service;

import com.formation.apirestdemo.model.Utilisateur;
import com.formation.apirestdemo.repository.UtilisateurRepository;
import jdk.jshell.execution.Util;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    public List<Utilisateur> recupererTous() {
        return utilisateurRepository.findAll();
    }

    public Optional<Utilisateur> recupererParId(Long id) {
        return utilisateurRepository.findById(id);
    }

    public Utilisateur creer(Utilisateur utilisateur) {
        utilisateur.setId(null);
        return utilisateurRepository.save(utilisateur);
    }

    public Optional<Utilisateur> mettreAJour(Long id, Utilisateur utilisateurModifie) {
        return utilisateurRepository.findById(id)
                .map(utilisateurExistant -> {
                    utilisateurExistant.setNom(utilisateurModifie.getNom());
                    utilisateurExistant.setPrenom(utilisateurModifie.getPrenom());
                    utilisateurExistant.setAge(utilisateurModifie.getAge());
                    utilisateurExistant.setEmail(utilisateurModifie.getEmail());
                    return utilisateurRepository.save(utilisateurExistant);
                });
    }

    public boolean supprimer(Long id) {
        if (utilisateurRepository.existsById(id)) {
            utilisateurRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Utilisateur> rechercherParNom(String nom) {
        return utilisateurRepository.findByNomContainingIgnoreCase(nom);
    }

    public List<Utilisateur> rechercherParPrenom(String prenom) {
        return utilisateurRepository.findByPrenomContainingIgnoreCase(prenom);
    }
}
