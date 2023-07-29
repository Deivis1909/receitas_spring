package com.receitas.receitas.respository;

import com.receitas.receitas.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ReceitaRepository extends JpaRepository<Receita,Long> {

    public Optional<Receita> findbyNome(String nome);
}
