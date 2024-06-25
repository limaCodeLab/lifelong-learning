package org.example.udemy.javacompleto.generics.set.setTree;

import java.util.Set;
import java.util.TreeSet;

public class UseExample {

    public static void main(String[] args) {

        // TreeSet não aceita repetição, implementacao mais lenta e garante a ordem dos objetos
        Set<String> setHash = new TreeSet<>();

        setHash.add("Isabella");
        setHash.add("Joaquim");
        setHash.add("Joaquim");
        setHash.add("Alan");

        System.out.println(setHash);
        System.out.println(setHash.contains("Alan"));
        System.out.println();

        // Percorrendo o setHash
        for (String name : setHash) {
            System.out.println(name);
        }

    }
}
