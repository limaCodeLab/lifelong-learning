package org.example.udemy.javacompleto.estrRepetitivas;

import java.util.Scanner;

public class ParaFor {

    static int soma = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            soma += num;
        }

        System.out.println("Soma: " + soma);
        sc.close();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("FIM!");

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("FIM!");
    }
}
