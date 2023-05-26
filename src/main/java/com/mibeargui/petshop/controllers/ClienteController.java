package com.mibeargui.petshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mibeargui.petshop.dto.ClienteDTO;
import com.mibeargui.petshop.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class ClienteController {
	
	@Autowired
    private UsuarioService usuarioService;

	@GetMapping(value = "/{id}")
    public ClienteDTO findById(@PathVariable Long id) {
		ClienteDTO result = cliente;
    }

}