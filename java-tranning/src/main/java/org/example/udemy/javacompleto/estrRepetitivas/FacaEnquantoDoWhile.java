package org.example.udemy.javacompleto.estrRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class FacaEnquantoDoWhile {

    static char resp;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double temperatura = sc.nextDouble();
            double fahrenheit = 9.0 * temperatura / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.2f\n", fahrenheit);
            System.out.println("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');


        sc.close();

    }
}
