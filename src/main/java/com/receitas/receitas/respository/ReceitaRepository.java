package com.receitas.receitas.respository;

import com.receitas.receitas.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita,Long> {
}
