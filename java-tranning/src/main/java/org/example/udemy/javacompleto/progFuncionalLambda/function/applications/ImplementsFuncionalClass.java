package org.example.udemy.javacompleto.progFuncionalLambda.function.applications;

import org.example.udemy.javacompleto.progFuncionalLambda.function.entities.Product;
import org.example.udemy.javacompleto.progFuncionalLambda.function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ImplementsFuncionalClass {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(System.out::println);
        System.out.println();

        // Alocando a nova lista com apenas os nomes modificador em uma outra lista apenas com os nomes.
        List<String> names = list.stream().map(new UpperCaseName()).toList();

        names.forEach(System.out::println);

    }
}
