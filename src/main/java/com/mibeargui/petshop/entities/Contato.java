package com.mibeargui.petshop.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "tbl_contato")
@Table(name = "tbl_contato")
public class Contato implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long contatoId;

    @Column(name = "Id_cliente")
    private long clienteId;


    @Column(name = "tipo")
    private String tipo;


    @Column(name = "valor")
    private double valor;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_contato_endereco",foreignKey = @ForeignKey(name = "fk_contato_endereco"))
    @JsonManagedReference
    private List<Endereco> enderecoList = new ArrayList<>();
    public void addEndereco(Endereco endereco) {
        enderecoList.add(endereco);
    }
    public void removeEndereco(Endereco endereco) {
        enderecoList.remove(endereco);
    }

}