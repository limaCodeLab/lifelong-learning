package org.example.udemy.javacompleto.estrRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class EnquantoWhile {
    static int total = 0;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        while (i != 0) {
            total += i;
            i = sc.nextInt();
        }

        System.out.println("Total: " + total);
        sc.close();
    }
}
