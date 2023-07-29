package com.receitas.receitas.enums;

public enum Restricao {
    GLUTEN(1L, "GLUTEN"),
    LACTOSE(2L, "LACTOSE");

    private final Long id;
    private final String name;

    Restricao(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
