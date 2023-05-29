package com.mibeargui.petshop.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "tbl_pets")
@Table(name = "tbl_pets")
public class Pets implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long petId;

    @NotBlank (message = "O nome do cliente não pode ser vazio")
    @Column(name = "clienteId")
    private long clienteId;

    @NotBlank (message = "A raça não pode ser vazia")
    private String racaPet;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;
    @NotBlank (message = "O nome  não pode ser vazio")
    private String nome;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_atendimento_pets", foreignKey = @ForeignKey(name = "fk_atendimento_pets"))
    @JsonManagedReference
    private List<Atendimento> atendimentoList = new ArrayList<>();
    public void addAtendimento(Atendimento atendimento) {
        atendimentoList.add(atendimento);
    }
    public void removeAtendimento(Atendimento atendimento) {
        atendimentoList.remove(atendimento);
    }

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_raca_pets", foreignKey = @ForeignKey(name = "fk_raca_pets"))
    @JsonBackReference
    private Raca raca;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (petId ^ (petId >>> 32));
        result = prime * result + (int) (clienteId ^ (clienteId >>> 32));
        result = prime * result + ((raca == null) ? 0 : raca.hashCode());
        result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
}