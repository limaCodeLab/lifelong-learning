package org.example.udemy.javacompleto.progFuncionalLambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {

        List<Integer> listNumbers = Arrays.asList(3, 4, 5, 6, 10, 7, 8);

        // Criando uma stream a partir de uma lista/colecao
        Stream<Integer> st1 = listNumbers.stream().map(x -> x * 10);
        System.out.println("st1 = " + Arrays.toString(st1.toArray()));

        // Criando uma stream utilizando o stream.of
        Stream<String> st2 = Stream.of("Maria", "Isabella", "Alan");
        System.out.println("st2 = " + Arrays.toString(st2.toArray()));

        //Criando um stream a partir de interacao
        // iterate( PRIMEIRO ELEMENTO, PREDICATE/LAMBDA);
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println("st3 = " + Arrays.toString(st3.limit(10).toArray()));

        // Criando um Stream da sequencia de fibonacci
        Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println("st4 = " + Arrays.toString(st4.limit(10).toArray()));

    }
}
