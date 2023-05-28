package com.mibeargui.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mibeargui.petshop.entities.Atendimento;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento,Long> {
    Atendimento findById(long id);

}