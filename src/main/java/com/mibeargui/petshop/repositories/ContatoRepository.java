package com.mibeargui.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mibeargui.petshop.entities.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato,Long> {
    Contato findById(long id);

}