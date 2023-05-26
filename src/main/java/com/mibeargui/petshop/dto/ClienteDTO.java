package com.mibeargui.petshop.dto;

import java.time.LocalDate;

import org.springframework.beans.BeanUtils;

import com.mibeargui.petshop.entities.Cliente;

public class ClienteDTO {

    private Long id;
    private String nome;
    private String cpf;
    private LocalDate dataCadastro;
    
    public ClienteDTO() {
    }
    
    public ClienteDTO(Cliente entities) {
    	BeanUtils.copyProperties(entities, this);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
  
}
