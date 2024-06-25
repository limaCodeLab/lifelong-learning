package org.example.udemy.javacompleto.generics.set.operationsWithSet;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UnioSets {

    public static void main(String[] args)
    {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        // Union de dois conjuntos(Set)
        Set<Integer> c = new TreeSet<>(a); // criando uma copia de A em C
        c.addAll(b);
        System.out.println("Union: ");
        System.out.println(c);


        // Intersection, somente aqueles elementos que tem em comum em ambos conjuntos
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println("Intersection: ");
        System.out.println(d);

        // Difference, a diferenca, quais do conjunto A que nao existem no conjunto B
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println("Difference: ");
        System.out.println(e);

    }

}
