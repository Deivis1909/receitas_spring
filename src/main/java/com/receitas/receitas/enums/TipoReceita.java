package com.receitas.receitas.enums;

public enum TipoReceita {
    DOCE(1L, "DOCE"),
    SALGADO(2L, "SALGADO");

    private final Long id;
    private final String name;

    TipoReceita(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
