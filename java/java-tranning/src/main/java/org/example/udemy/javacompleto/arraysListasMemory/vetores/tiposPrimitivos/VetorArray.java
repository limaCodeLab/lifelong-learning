package org.example.udemy.javacompleto.arraysListasMemory.vetores.tiposPrimitivos;

import java.util.Locale;
import java.util.Scanner;

public class VetorArray {

    static double sum = 0.0;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] vect = new double[n]; // Criando vetor e seu tamanho

        for (int i=0; i<n ; i++){
            vect[i] = sc.nextDouble();
        }

        for (int i=0; i<n ; i++){
            sum += vect[i];
        }

        System.out.printf("AVERAGE HEIGHT = %.2f", sum/n);

        sc.close();

    }
}
