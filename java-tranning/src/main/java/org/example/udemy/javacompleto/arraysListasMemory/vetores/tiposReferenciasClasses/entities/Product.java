package org.example.udemy.javacompleto.arraysListasMemory.vetores.tiposReferenciasClasses.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

}
