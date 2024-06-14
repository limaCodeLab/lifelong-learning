package org.example.udemy.javacompleto.generics.wildcardTypes.delimited.problemTwo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *Neste casa sera trabalhao Covariancia e Contravariancia, que sao 2 tipos de wildcards
 *
 * Contravariancia: "? super Shape" indica que o tipo da variável pode ser qualquer supertipo de Number
 * (Nossa obj usada como base) podendo assim adicionar um elmento na lista, mas nao podendo realizar o get do elmento
 *
 * Covariancia: "? extends Shape" indica que o tipo da variável pode ser qualquer subtipo de Number, podendo
 * assim realizer o get do elemento, mas nao adicionar elmento na lista
 *
 * Utilizando wildcards para fazer o contravariancia e covariancia consigo copiar uma lista de tipos diferente dentro de
 * outra lista
 */
public class Program {

    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1,2,6,4,5);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for(Number number : source) { // Covariancia posso acessar os items, percorro a lista
            destiny.add(number); // Contravariancia posso adicionar items
        }
//        destiny.addAll(source); posso fazer dessa forma tbm, simplificando copiando tudo que esta na outra lista
    }

    public static void printList(List<?> list){
        for (Object obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }

}
