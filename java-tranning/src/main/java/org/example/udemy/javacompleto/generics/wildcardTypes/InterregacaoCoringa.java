package org.example.udemy.javacompleto.generics.wildcardTypes;

import java.util.Arrays;
import java.util.List;

public class InterregacaoCoringa {

    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1,2,3,4,5);
        List<String> myString = Arrays.asList("Maria", "Alex", "Bob");
         printList(myInts);
         printList(myString);
    }

    /**
     * O ? indica que o tipo da variável pode ser qualquer lista de qualquer tipo
     * Mas este lista nao pode ter nenhum item adicionado a ela, pois o compilador nao sabe
     * qual e o tipo especifico da lista ao certo
     *
     * Obs. Um Interger e um Object, mas um Object nao e um Interger...etc
     */
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }


}
