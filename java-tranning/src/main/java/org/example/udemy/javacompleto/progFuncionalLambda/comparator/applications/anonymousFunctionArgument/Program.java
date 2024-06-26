package org.example.udemy.javacompleto.progFuncionalLambda.comparator.applications.anonymousFunctionArgument;

import org.example.udemy.javacompleto.progFuncionalLambda.comparator.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Passando a funcao anonima como argumento para o metodo sort
        list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }

    }

}
