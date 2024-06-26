package org.example.udemy.javacompleto.genericsSetMap.methodGeneric.formThree.services;

import java.util.List;

public class CalculationService {

    /* Método de comparação de dois valores, precisa-se colocar que o tipo T tambem
     * seja tamebm um comparable, assim como o método max ira funcionar corretamente, pois
     * o objeto T e o Comparable<T> sao do mesmo tipo. Com isso podemos dizer que o method esta generico
     */
    public static <T extends Comparable<? super T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
