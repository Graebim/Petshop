package com.mibeargui.petshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mibeargui.petshop.dto.ClienteDTO;
import com.mibeargui.petshop.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
    private ClienteService clienteService;

	@GetMapping(value = "/{id}")
    public ClienteDTO findById(@PathVariable Long id) {
		ClienteDTO result = clienteService.findById(id);
		return result;
    }
	
	@GetMapping
	public List<ClienteDTO> findAll(){
		List<ClienteDTO> result = clienteService.findAll();
		return result;
	}

}