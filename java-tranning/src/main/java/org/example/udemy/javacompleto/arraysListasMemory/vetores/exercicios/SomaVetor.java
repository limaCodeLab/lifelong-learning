package org.example.udemy.javacompleto.arraysListasMemory.vetores.exercicios;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("QUANTOS NUMEROS VOCE VAI DIGITAR? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i< vect.length; i++){
            System.out.print("DIGITE UM NUMERO: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("\nVALORES = ");
        for (int i=0; i< vect.length; i++){
            System.out.print(vect[i] + " ");
        }

        double sum = Arrays.stream(vect).sum();
        System.out.println("\nSOMA = " + sum);
        System.out.println("MEDIA = " + sum / vect.length);

        sc.close();

    }

}
