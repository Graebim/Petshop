package com.mibeargui.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mibeargui.petshop.entities.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {
    // ...
}