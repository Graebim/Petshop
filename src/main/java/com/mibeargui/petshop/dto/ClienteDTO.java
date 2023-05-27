package com.mibeargui.petshop.dto;

import java.time.LocalDate;

import com.mibeargui.petshop.entities.Cliente;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ClienteDTO {

    private Long id;

    @NotBlank
    private String nome;
    
    @Size(max = 11)
    private String cpf;

    private LocalDate dataCadastro;

    public ClienteDTO() {
    }

    public ClienteDTO(Cliente entities) {
        this.id = entities.getId();
        this.nome = entities.getNome();
        this.cpf = entities.getCpf();
        this.dataCadastro = entities.getDataCadastro();
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