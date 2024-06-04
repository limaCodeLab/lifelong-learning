package org.example.udemy.javacompleto.arraysListasMemory.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

    static double maior;
    static int posicao;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        maior = vect[0];
        for (int i=1; i < vect.length; i++) {
            if (maior < vect[i]) {
                maior = vect[i];
                posicao = i;
            }
        }

        System.out.println("\nMAIOR VALOR: " + maior);
        System.out.print("POSICAO DO MAIOR VALOR: " + posicao);


        sc.close();

    }
}
