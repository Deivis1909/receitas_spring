package com.receitas.receitas.respository;

import com.receitas.receitas.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRepository extends JpaRepository<Ingrediente,Long> {
}
