package com.formation.apirestdemo.service;

import com.formation.apirestdemo.repository.NotificationService;
import org.springframework.stereotype.Service;

@Service("emailNotification")
public class EmailNotificationService implements NotificationService {

    @Override
    public void notifier(String destinataire, String message) {
        // Envoi d'e-mail non implémenté
    }
}