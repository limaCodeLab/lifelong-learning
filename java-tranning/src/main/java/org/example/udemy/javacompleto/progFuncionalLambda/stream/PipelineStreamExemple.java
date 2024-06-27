package org.example.udemy.javacompleto.progFuncionalLambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PipelineStreamExemple {

    public static void main(String[] args) {

        List<Integer> listNumbers = Arrays.asList(3, 4, 5, 6, 10, 7, 8);

        Stream<Integer> st1 = listNumbers.stream().map(x -> x * 10);
        System.out.println("st1 = " + Arrays.toString(st1.toArray()));

        int sum = listNumbers.stream().reduce(0, (x, y) -> x + y);
        System.out.println("sum = " + sum);


        // PipeLine
        List<Integer> newList = listNumbers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .toList();

        System.out.println("newList = " + newList);
        System.out.println();
    }
}
