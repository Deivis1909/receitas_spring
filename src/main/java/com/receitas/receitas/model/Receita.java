package com.receitas.receitas.model;

import com.receitas.receitas.enums.NivelDificuldade;
import com.receitas.receitas.enums.Restricao;
import com.receitas.receitas.enums.TipoReceita;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Receita {



    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;


    private String titulo;

    private int tempoPreparo;

    @Column
    private NivelDificuldade nivelDificuldade;

    private int qutadePessoasServidas;


    //mapped by mapeia o relacionamento das tabelas
    // vai criar uma coluna ingredientes na tabela receita
    // mapped by mapeia o lado do um no ralacionamento
    @OneToMany(mappedBy ="receita")
    private List<Ingrediente> ingredientes;

    private List<String> passosPreparo;

    private TipoReceita tipoReceita;



    private List<Restricao> restricoes;

}
