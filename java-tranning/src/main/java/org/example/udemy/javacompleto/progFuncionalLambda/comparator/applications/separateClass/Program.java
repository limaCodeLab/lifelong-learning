package org.example.udemy.javacompleto.progFuncionalLambda.comparator.applications.separateClass;

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

        // Estanciando uma classe que implementa o Comparator para comparar objetos
        list.sort(new MyComparator());

        for (Product p : list) {
            System.out.println(p);
        }

    }

}
