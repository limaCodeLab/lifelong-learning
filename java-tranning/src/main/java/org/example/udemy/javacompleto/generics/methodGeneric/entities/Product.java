package org.example.udemy.javacompleto.generics.methodGeneric.entities;

import lombok.Getter;
import lombok.Setter;


/**
 * Necessário implementar a interface Comparable para comparar objetos
 */
@Getter
@Setter
public class Product implements Comparable<Product> {

    private String nome;
    private Double price;

    public Product(String nome, Double price) {
        this.nome = nome;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return this.price.compareTo(other.price); // Comparando objeto com outra instância
    }


    @Override
    public String toString() {
        return "Product{" +
                "nome='" + nome + '\'' +
                ", price=" + price +
                '}';
    }
}
