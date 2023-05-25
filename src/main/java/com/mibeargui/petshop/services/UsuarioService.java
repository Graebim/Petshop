package com.mibeargui.petshop.services;

import org.springframework.stereotype.Service;

import com.mibeargui.petshop.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Implemente os métodos de serviço relacionados a usuários
}