package org.example.udemy.javacompleto.generics.set.setHash;

import java.util.HashSet;
import java.util.Set;

public class UseExample {

    public static void main(String[] args) {

        // HashSet não aceita repetição, implementacao mais rápida e nao garante a ordem dos objetos
        Set<String> setHash = new HashSet<>();

        setHash.add("Joaquim");
        setHash.add("Isabella");
        setHash.add("Alan");
        setHash.add("Joaquim");

        System.out.println(setHash);
        System.out.println(setHash.contains("Alan"));
        System.out.println();

        // Percorrendo o setHash
        for (String name : setHash) {
            System.out.println(name);
        }

    }
}
