package com.mibeargui.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mibeargui.petshop.entities.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
    // ...
}