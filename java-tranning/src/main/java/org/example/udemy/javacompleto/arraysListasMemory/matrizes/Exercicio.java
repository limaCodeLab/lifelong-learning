package org.example.udemy.javacompleto.arraysListasMemory.matrizes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio {

    static int rows;
    static int columns;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] mat = new int[rows][columns];

        for (int i=0; i< mat.length; i++) { // Percorrendo linhas
            for (int j=0; j<mat[i].length; j++) { // Percorrendo colunas
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(mat[1].length);
        System.out.println(mat.length);

        System.out.print("Number matrix: ");
        int number = sc.nextInt();

        for (int i=0; i< mat.length; i++){
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] == number) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }

}
