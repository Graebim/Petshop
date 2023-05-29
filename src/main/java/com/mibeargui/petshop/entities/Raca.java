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
@Entity(name = "tbl_raca")
@Table(name = "tbl_raca")
public class Raca implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long racaId;

    private String descricao;


    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_raca_pets",foreignKey = @ForeignKey(name = "fk_raca_pets"))
    @JsonManagedReference
    private List<Pets> petsList = new ArrayList<>();
    public void addPets(Pets pets) {
        petsList.add(pets);
    }
    public void removePets(Pets pets) {
        petsList.remove(pets);
    }


}
