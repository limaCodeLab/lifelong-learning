package org.example.udemy.javacompleto.arraysListasMemory.vetores.exercicios;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double sum = Arrays.stream(vect).sum();
        double avg = sum / vect.length;
        System.out.println("\nMEDIA DO VETOR: " + avg);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < avg) {
                System.out.println(vect[i]);
            }
        }

        sc.close();

    }

}
