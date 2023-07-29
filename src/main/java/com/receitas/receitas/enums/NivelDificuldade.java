package com.receitas.receitas.enums;

public enum NivelDificuldade {

  FACIL(1L, "FACIL"),
    MEDIO(3L,"MEDIO"),
    DIFICIL(2L, "DIFICIL");

    private final Long id;
    private final String name;

    NivelDificuldade(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
