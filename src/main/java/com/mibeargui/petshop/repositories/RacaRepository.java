package com.mibeargui.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mibeargui.petshop.entities.Raca;

@Repository
public interface RacaRepository extends JpaRepository<Raca,Long> {
    Raca findById(long id);

}