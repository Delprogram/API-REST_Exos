package com.formation.apirestdemo.repository;

import com.formation.apirestdemo.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface NotificationService {
    void notifier(String destinataire, String message);
}