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

import com.mibeargui.petshop.entities.Atendimento;
import com.mibeargui.petshop.repositories.AtendimentoRepository;
import com.mibeargui.petshop.swagger.AuthorizationInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping
@Api(value="API REST Pets")
public class AtendimentoController {


    @Autowired
    AtendimentoRepository atendimentoRepoRepository;

    @AuthorizationInfo
    @ApiOperation(value="Retorna uma lista de atendimentos")
    @GetMapping(value="/atendimentos")
    public List<Atendimento> listaAtendimentos(){
        return atendimentoRepoRepository.findAll();
    }
    @AuthorizationInfo
    @ApiOperation(value="Retorna um atendimento unico")
    @GetMapping("/atendimento/{id}")
    public Atendimento listaAtendimentoUnico(@PathVariable(value="id") long id){
        return atendimentoRepoRepository.findById(id);
    }
    @AuthorizationInfo
    @ApiOperation(value="Adiciona um atendimento")
    @PostMapping(value="/atendimento")
    public Atendimento salvaAtendimento(@RequestBody @Validated Atendimento atendimento) {
        return atendimentoRepoRepository.save(atendimento);
    }
    @AuthorizationInfo
    @ApiOperation(value="Deleta um atendimento")
    @DeleteMapping(value="/atendimento/{id}")
    public void deletaatendimento(@PathVariable(value="id") long id) { atendimentoRepoRepository.deleteById(id);  }
    @AuthorizationInfo
    @ApiOperation(value="Atualiza um atendimento")
    @PutMapping(value="/atendimento")
    public Atendimento atualizaAtendimento(@RequestBody @Validated Atendimento atendimento) {
        return atendimentoRepoRepository.save(atendimento);
    }


}