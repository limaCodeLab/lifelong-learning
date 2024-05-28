package org.example.udemy.javacompleto.arraysListasMemory.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores vai ter em cada vetor? ");
        int n = sc.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectResultante = new int[n];

        System.out.println("Digite os valores do primeiro vetor: ");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do segundo vetor: ");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vectResultante.length; i++) {
            vectResultante[i] = vectA[i] + vectB[i];
            System.out.print(vectResultante[i] + " ");
        }

        sc.close();
    }

}
