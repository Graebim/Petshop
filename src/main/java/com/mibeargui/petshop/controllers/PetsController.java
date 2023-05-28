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

import com.mibeargui.petshop.entities.Pets;
import com.mibeargui.petshop.repositories.PetRepository;
import com.mibeargui.petshop.swagger.AuthorizationInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping
@Api(value="API REST Pets")
public class PetsController {

    @Autowired
    PetRepository petRepository;
    @AuthorizationInfo
    @ApiOperation(value="Retorna uma lista de Pets")
    @GetMapping(value="/pets")
    public List<Pets> listaPets(){
        return petRepository.findAll();
    }
    @AuthorizationInfo
    @ApiOperation(value="Retorna um pet unico")
    @GetMapping("/pet/{id}")
    public Pets listaPetUnico(@PathVariable(value="id") long id){
        return petRepository.findById(id);
    }
    @AuthorizationInfo
    @ApiOperation(value="Adiciona um pet")
    @PostMapping(value="/pet")
    public Pets salvaPet(@RequestBody @Validated Pets pets) {
        return petRepository.save(pets);
    }
    @AuthorizationInfo
    @ApiOperation(value="Deleta um pet")
    @DeleteMapping(value="/pet/{id}")
    public void deletaPet(@PathVariable(value="id") long id) {
    	petRepository.deleteById(id);
    }
    @AuthorizationInfo
    @ApiOperation(value="Atualiza um pet")
    @PutMapping(value="/pet")
    public Pets atualizaPet(@RequestBody @Validated Pets pets) {
        return petRepository.save(pets);
    }

}