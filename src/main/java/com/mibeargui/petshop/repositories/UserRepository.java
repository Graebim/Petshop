package com.mibeargui.petshop.repositories;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mibeargui.petshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {


    User findById(long id);

    boolean existsById(long id);
    Optional<User> findByUsername(String username);

    @Override
    Page<User> findAll(Pageable pageable);

    boolean existsByCpf(String cpf);
    boolean existsByUsername(String username);


}