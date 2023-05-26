package com.mibeargui.petshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mibeargui.petshop.dto.ClienteDTO;
import com.mibeargui.petshop.entities.Cliente;
import com.mibeargui.petshop.repositories.ClienteRepository;

public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Transactional(readOnly = true)
	public ClienteDTO findById(Long id) {
		Cliente result = clienteRepository.findById(id).get();
		ClienteDTO dto = new ClienteDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<ClienteDTO> findAll(){
		List<Cliente> result = clienteRepository.findAll();
		List<ClienteDTO> dto = result.stream().map(x -> new ClienteDTO(x)).toList();
		return dto;
	}
}
