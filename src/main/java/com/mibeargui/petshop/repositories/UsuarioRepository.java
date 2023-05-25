package com.mibeargui.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mibeargui.petshop.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    // ...
}