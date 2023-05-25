package com.mibeargui.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mibeargui.petshop.entities.Raca;

public interface RacaRepository extends JpaRepository<Raca, Long> {
    // ...
}