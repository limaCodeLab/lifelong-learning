package org.example.udemy.javacompleto.progFuncionalLambda.consumer.applications;

import org.example.udemy.javacompleto.progFuncionalLambda.consumer.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ReferenceMethodNoStatic {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Referencia ao método nao stático
        list.forEach(Product::nonStaticProductAccept);

        list.forEach(System.out::println);

    }
}
