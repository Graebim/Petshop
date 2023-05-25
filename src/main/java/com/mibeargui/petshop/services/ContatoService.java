package com.mibeargui.petshop.services;

import org.springframework.stereotype.Service;

import com.mibeargui.petshop.repositories.ContatoRepository;

@Service
public class ContatoService {
    private final ContatoRepository contatoRepository;

    public ContatoService(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    // Implemente os métodos de serviço relacionados a contatos
}

// Implemente os serviços para as outras entidades (Cliente, Endereco, Atendimento, Pet, Raca)
