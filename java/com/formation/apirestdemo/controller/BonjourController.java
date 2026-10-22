package com.formation.apirestdemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/bonjour")
public class BonjourController {

    public record Message(String message) { }
    public record PrenomRequest(String prenom) { }

    @GetMapping
    public Message bonjour() {
        return new Message("Bonjour le monde!");
    }

    @GetMapping("/{nom}")
    public Message bonjourNom (@PathVariable String nom) {
        return new Message("Bonjour " + nom + " !");
    }

    @PostMapping
    public Message bienvenue(@RequestBody PrenomRequest request) {
        return new Message("Bienvenue " + request.prenom() + " !");
    }
}
