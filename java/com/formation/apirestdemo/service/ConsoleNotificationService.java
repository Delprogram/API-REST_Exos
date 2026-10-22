package com.formation.apirestdemo.service;

import com.formation.apirestdemo.repository.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("consoleNotification")
public class ConsoleNotificationService implements NotificationService {

    @Override
    public void notifier(String destinataire, String message) {
        System.out.println("[NOTIFICATION] " + destinataire + " : " + message);
    }
}