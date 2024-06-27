package org.example.udemy.javacompleto.progFuncionalLambda.consumer.applications;

import org.example.udemy.javacompleto.progFuncionalLambda.consumer.entities.Product;
import org.example.udemy.javacompleto.progFuncionalLambda.consumer.util.ConsumerProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ImplementsFuncionalClass {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Estanciado a partir da classe util/ConsumerProduct onde encontra-se a implemnetação do método test Consumer
        list.forEach(new ConsumerProduct());

        list.forEach(System.out::println);

    }
}
