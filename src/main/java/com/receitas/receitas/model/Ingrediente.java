package com.receitas.receitas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Ingrediente {

    //jopin colun vai guardar a chave na coluna ID_RECEITA
    @ManyToOne
    @JoinColumn(name = "id_receita")
    private Receita receita;
}
