package org.example.udemy.javacompleto.arraysListasMemory.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("QUANTOS NUMEROS VOCE VAI DIGITAR? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i=0; i< vect.length; i++){
            vect[i] = sc.nextInt();
        }

        System.out.println("NEGATIVOS:");

        for (int i=0; i< vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();

    }

}