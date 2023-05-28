package com.mibeargui.petshop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mibeargui.petshop.entities.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}