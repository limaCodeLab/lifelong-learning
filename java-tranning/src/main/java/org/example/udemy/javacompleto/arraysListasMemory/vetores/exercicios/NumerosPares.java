package org.example.udemy.javacompleto.arraysListasMemory.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

    static int qtdPares;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numero voce vai digitar?");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i=0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }


        System.out.println("\nNUMEROS PARES: ");
        for (int i=0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                qtdPares++;
                System.out.print(vect[i] + " ");
            }
        }

        System.out.print("\n\nQUANTIDADE DE NUMEROS PARES: " + qtdPares);

        sc.close();
    }

}
