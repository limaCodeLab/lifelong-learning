package org.example.udemy.javacompleto.generics.formTwo.application;

import org.example.udemy.javacompleto.generics.formTwo.services.PrintService;

import java.util.Scanner;


public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* forma 02 utilizando type safty, retiramos a necessecidades de casting e nao vai deixar
        * Adicionar outro objeto que nao seja do tipo Interger ma lista instanciada, exemplo abaixo
        */
        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}
