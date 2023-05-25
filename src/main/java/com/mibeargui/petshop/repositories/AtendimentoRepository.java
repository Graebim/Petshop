package com.mibeargui.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mibeargui.petshop.entities.Atendimento;

public interface AtendimentoRepository extends JpaRepository<Atendimento, Long> {
    // ...
}