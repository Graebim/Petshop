package com.mibeargui.petshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mibeargui.petshop.entities.Endereco;
import com.mibeargui.petshop.repositories.EnderecoRepository;
import com.mibeargui.petshop.swagger.AuthorizationInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping
@Api(value="API REST Pets")
public class EnderecoController {

    @Autowired
    EnderecoRepository enderecoRepository;
    @AuthorizationInfo
    @ApiOperation(value="Retorna uma lista de endereços")
    @GetMapping(value="/enderecos")
    public List<Endereco> listaEnderecos(){
        return enderecoRepository.findAll();
    }
    @AuthorizationInfo
    @ApiOperation(value="Retorna um endereço unico")
    @GetMapping("/endereco/{id}")
    public Endereco listaEnderecoUnico(@PathVariable(value="id") long id){
        return enderecoRepository.findById(id);
    }
    @AuthorizationInfo
    @ApiOperation(value="Adiciona um endereço")
    @PostMapping(value="/endereco")
    public Endereco salvaPet(@RequestBody @Validated Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
    @AuthorizationInfo
    @ApiOperation(value="Deleta um endereco")
    @DeleteMapping(value="/endereco/{id}")
    public void deletaEndereco(@PathVariable(value="id") long id) {
    	enderecoRepository.deleteById(id);
    }
    @AuthorizationInfo
    @ApiOperation(value="Atualiza um endereço")
    @PutMapping(value="/endereco")
    public Endereco atualizaEndereco(@RequestBody @Validated Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

}