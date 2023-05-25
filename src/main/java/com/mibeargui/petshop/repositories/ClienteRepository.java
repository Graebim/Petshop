package com.mibeargui.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mibeargui.petshop.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // ...
}