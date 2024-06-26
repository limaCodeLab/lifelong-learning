package org.example.udemy.javacompleto.progFuncionalLambda.comparator.applications.separateClass;

import org.example.udemy.javacompleto.progFuncionalLambda.comparator.entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {


    @Override
    public int compare(Product p1, Product p2) {

        // Aqui dentro vai a logica de negocio para seu projeto
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
