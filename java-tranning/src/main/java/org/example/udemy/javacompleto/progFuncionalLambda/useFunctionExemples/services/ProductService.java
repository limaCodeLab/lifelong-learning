package org.example.udemy.javacompleto.progFuncionalLambda.useFunctionExemples.services;

import org.example.udemy.javacompleto.progFuncionalLambda.useFunctionExemples.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    /**
     * Aloca-se o criterio do if para soma, justamente para que tenhamos nosso method
     * com inumeras formas de criterios para se realizar a soma, eliminamos um ponto de manutencao
     * grande no programa caso a regra de negocio precise ser alterada
     * ASSIM CABAMOS TENDO UM FUNCAO COMPLETAMENTE FLEXIVEL.
     *
     * UMA FUNCAO QUE RECEBE OUTRA FUNCAO COMO PARAMETRO
     */
    public double filteredSum(List<Product> list, Predicate<Product> criteria) {

        double sum = 0.0;
        for (Product p : list) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
