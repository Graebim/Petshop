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

import com.mibeargui.petshop.entities.Raca;
import com.mibeargui.petshop.repositories.RacaRepository;
import com.mibeargui.petshop.swagger.AuthorizationInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping
@Api(value="API REST Pets")
public class RacaController {

    @Autowired
    RacaRepository racaRepository;
    @AuthorizationInfo
    @ApiOperation(value="Retorna uma lista de Raças")
    @GetMapping(value="/racas")
    public List<Raca> listaRacas(){
        return racaRepository.findAll();
    }
    @AuthorizationInfo
    @ApiOperation(value="Retorna uma raça unica")
    @GetMapping("/raca/{id}")
    public Raca listaRacaUnico(@PathVariable(value="id") long id){
        return racaRepository.findById(id);
    }
    @AuthorizationInfo
    @ApiOperation(value="Adiciona uma raça")
    @PostMapping(value="/raca")
    public Raca salvaRaca(@RequestBody @Validated Raca raca) {
        return racaRepository.save(raca);
    }

    @AuthorizationInfo
    @ApiOperation(value="Deleta uma raça")
    @DeleteMapping(value="/raca/{id}")
    public void deletaPet(@PathVariable(value="id") long id) {
    	racaRepository.deleteById(id);
    }

    @AuthorizationInfo
    @ApiOperation(value="Atualiza um raça")
    @PutMapping(value="/raca")
    public Raca atualizaPet(@RequestBody @Validated Raca raca) {
        return racaRepository.save(raca);
    }

}