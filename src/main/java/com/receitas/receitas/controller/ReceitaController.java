package com.receitas.receitas.controller;


import com.receitas.receitas.model.Receita;
import com.receitas.receitas.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/receita")
public class ReceitaController {

    @Autowired
    private ReceitaService receitaService;


    @GetMapping
    public List<Receita> buscaReceita(){

        return this.receitaService.buscaReceitas();

    }
}
