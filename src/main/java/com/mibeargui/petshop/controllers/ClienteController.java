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

import com.mibeargui.petshop.entities.Cliente;
import com.mibeargui.petshop.repositories.ClienteRepository;
import com.mibeargui.petshop.swagger.AuthorizationInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping
@Api(value="API REST Pets")
public class ClienteController {


    @Autowired
    ClienteRepository clienteRepository;

    @AuthorizationInfo
    @ApiOperation(value="Retorna uma lista de clientes")
    @GetMapping(value="/clientes")
    public List<Cliente> listaClientes(){
        return clienteRepository.findAll();
    }
    @AuthorizationInfo
    @ApiOperation(value="Retorna um cliente unico")
    @GetMapping("/cliente/{id}")
    public Cliente listaClienteUnico(@PathVariable(value="id") long id){
        return clienteRepository.findById(id);
    }
    @AuthorizationInfo
    @ApiOperation(value="Adiciona um cliente")
    @PostMapping(value="/cliente")
    public Cliente salvaCliente(@RequestBody @Validated Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    @AuthorizationInfo
    @ApiOperation(value="Deleta um cliente")
    @DeleteMapping(value="/cliente/{id}")
    public void deletaCliente(@PathVariable(value="id") long id) { clienteRepository.deleteById(id);  }
    @AuthorizationInfo
    @ApiOperation(value="Atualiza um cliente")
    @PutMapping(value="/cliente")
    public Cliente atualizaCliente(@RequestBody @Validated Cliente cliente) {
        return clienteRepository.save(cliente);
    }


}