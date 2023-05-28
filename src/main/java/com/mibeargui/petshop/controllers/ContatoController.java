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

import com.mibeargui.petshop.entities.Contato;
import com.mibeargui.petshop.repositories.ContatoRepository;
import com.mibeargui.petshop.swagger.AuthorizationInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping
@Api(value="API REST Pets")
public class ContatoController {


    @Autowired
    ContatoRepository contatoRepository;

    @AuthorizationInfo
    @ApiOperation(value="Retorna uma lista de contatos")
    @GetMapping(value="/contatos")
    public List<Contato> listaContatos(){
        return contatoRepository.findAll();
    }
    @AuthorizationInfo
    @ApiOperation(value="Retorna um contato unico")
    @GetMapping("/contato/{id}")
    public Contato listaContatoUnico(@PathVariable(value="id") long id){
        return contatoRepository.findById(id);
    }
    @AuthorizationInfo
    @ApiOperation(value="Adiciona um contato")
    @PostMapping(value="/contato")
    public Contato salvaContato(@RequestBody @Validated Contato contato) {
        return contatoRepository.save(contato);
    }
    @AuthorizationInfo
    @ApiOperation(value="Deleta um contato")
    @DeleteMapping(value="/contato/{id}")
    public void deletaContato(@PathVariable(value="id") long id) { contatoRepository.deleteById(id);  }
    @AuthorizationInfo
    @ApiOperation(value="Atualiza um contato")
    @PutMapping(value="/contato")
    public Contato atualizaContato(@RequestBody @Validated Contato contato) {
        return contatoRepository.save(contato);
    }


}