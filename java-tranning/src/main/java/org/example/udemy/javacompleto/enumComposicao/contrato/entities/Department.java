package org.example.udemy.javacompleto.enumComposicao.contrato.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Department {

    private String name;

    public Department() {
    }
    public Department(String name) {
        this.name = name;
    }

}
