package com.mibeargui.petshop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mibeargui.petshop.entities.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

} 