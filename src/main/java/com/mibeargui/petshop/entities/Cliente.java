package com.mibeargui.petshop.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@Entity(name = "tbl_cliente")
@Table(name = "tbl_cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long clientId;

    @Column(name = "nome")
    private String nome;

    //@CPF
    @Column(name = "cpf")
    private String cpf;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "Data_de_cadastro")
    private LocalDate data_Cadastro;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_endereco_cliente",foreignKey = @ForeignKey(name = "fk_endereco_cliente"))
    @JsonManagedReference
    private List<Endereco> enderecoList = new ArrayList<>();
    public void addEndereco(Endereco endereco) {
        enderecoList.add(endereco);
    }
    public void removeEndereco(Endereco endereco) {
        enderecoList.remove(endereco);
    }



}