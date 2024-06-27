package org.example.udemy.javacompleto.progFuncionalLambda.useFunctionExemples.application;


import org.example.udemy.javacompleto.progFuncionalLambda.useFunctionExemples.entities.Product;
import org.example.udemy.javacompleto.progFuncionalLambda.useFunctionExemples.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        // Passando um condicao funcional para regra de soma dos valores
        double sum = ps.filteredSum(list, product -> product.getName().toUpperCase().charAt(0) == 'M');

        System.out.println("Sum = " + String.format("%.2f", sum));


    }
}
