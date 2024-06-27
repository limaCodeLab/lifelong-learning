package org.example.udemy.javacompleto.progFuncionalLambda.function.util;

import org.example.udemy.javacompleto.progFuncionalLambda.function.entities.Product;

import java.util.function.Function;

// Entrada e um Product e saida uma String da logica de negocio
public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}