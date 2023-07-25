package com.receitas.receitas.service;


import com.receitas.receitas.model.Receita;
import com.receitas.receitas.respository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;
    private ReceitaService receitaService;
    public List<Receita> buscaReceitas() {
        return receitaRepository.findAll();
    }
}
