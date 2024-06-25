package org.example.udemy.javacompleto.generics.map.useObject.application;

import org.example.udemy.javacompleto.generics.map.useObject.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {

        Map<Product, Integer> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 100);
        stock.put(p2, 200);
        stock.put(p3, 50);

        Product ps = new Product("Tv", 900.0);
        System.out.println(stock.containsKey(ps) + "\n");

        System.out.println(stock);

    }
}
