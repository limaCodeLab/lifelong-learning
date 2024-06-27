package org.example.udemy.javacompleto.progFuncionalLambda.consumer.util;

import org.example.udemy.javacompleto.progFuncionalLambda.consumer.entities.Product;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerProduct implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}