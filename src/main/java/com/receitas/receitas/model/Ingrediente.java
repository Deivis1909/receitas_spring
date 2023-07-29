package com.receitas.receitas.model;

import jakarta.persistence.*;
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

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id ;

    //jopin colun vai guardar a chave na coluna ID_RECEITA
    @ManyToOne
    @JoinColumn
    private Receita receita;
}
