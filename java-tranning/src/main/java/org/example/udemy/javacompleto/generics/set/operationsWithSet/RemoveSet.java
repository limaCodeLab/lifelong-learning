package org.example.udemy.javacompleto.generics.set.operationsWithSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveSet {

    public static void main(String[] args) {

        // LinkedHashSet nao permite elementos duplicados e mantem a ordem de como os elementos foram inseridos
        Set<String> setHash = new LinkedHashSet<>();

        setHash.add("Isabella");
        setHash.add("Alan");
        setHash.add("Joaquim");
        setHash.add("Joaquim");
        System.out.println(setHash);
        System.out.println(setHash.contains("Alan"));
        System.out.println();

        // Removendo elemento
        setHash.remove("Alan");

        System.out.println(setHash);
        System.out.println(setHash.contains("Alan"));
        System.out.println();

        // Removendo elementos que comecem com J, seguindo o predicado
        setHash.removeIf(x -> x.charAt(0) == 'J');
        System.out.println(setHash);

        // Percorrendo o setHash
        for (String name : setHash) {
            System.out.println(name);
        }

    }

}
