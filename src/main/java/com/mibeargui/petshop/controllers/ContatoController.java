package com.mibeargui.petshop.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mibeargui.petshop.services.ContatoService;

@RestController
@RequestMapping("/api/contatos")
public class ContatoController {
    private final ContatoService contatoService;

    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }

    // Implemente os métodos de controle para contatos
}

//Implemente os controladores para as outras entidades (Cliente, Endereco, Atendimento, Pet, Raca)
