package com.mibeargui.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mibeargui.petshop.entities.Pets;

@Repository
public interface PetRepository extends JpaRepository<Pets,Long> {

    Pets findById(long id);

}