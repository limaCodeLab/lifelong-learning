package org.example.udemy.javacompleto.estrRepetitivas;

import java.util.Scanner;

public class ExerciciosFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        exercicioTRES(sc);
        sc.close();
    }

    public static void exercicioUM(Scanner sc) {

        int x = sc.nextInt();
        for (int i = 1; i <= x ; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("Fim");

    }

    public static void exercicioDOIS(Scanner sc) {

        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            }
            else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");


    }

    public static void exercicioTRES(Scanner sc) {

        int n = sc.nextInt();

        for (int i=0; i<n ; i++) {
           double n1 = sc.nextDouble();
           double n2 = sc.nextDouble();
           double n3 = sc.nextDouble();

           double media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
           System.out.printf("%.1f\n", media);
        }

    }

}
