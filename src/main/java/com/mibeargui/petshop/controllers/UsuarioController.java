package com.mibeargui.petshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mibeargui.petshop.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
    private UsuarioService usuarioService;

//	@GetMapping(value = "/{cpf}")
//    public UsuarioController(UsuarioService usuarioService) {
//       this.usuarioService = usuarioService;
//    }

}