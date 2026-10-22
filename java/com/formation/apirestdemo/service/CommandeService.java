package com.formation.apirestdemo.service;

import com.formation.apirestdemo.repository.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommandeService {

    private final NotificationService notificationService;

    public CommandeService(@Qualifier("emailNotification") NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}