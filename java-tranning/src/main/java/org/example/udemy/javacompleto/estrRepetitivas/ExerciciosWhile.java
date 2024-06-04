package org.example.udemy.javacompleto.estrRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosWhile {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        exercicioTres(sc);
        sc.close();
    }

    public static void exervivioUM(Scanner sc) {
        int senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido".toUpperCase());

    }

    public static void exervivioDois(Scanner sc) {

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        System.out.println("NULA");

    }

    public static void exercicioTres(Scanner sc) {

        int combustivel = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        while (combustivel != 4) {
            switch (combustivel) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    System.out.println("Codigo invalido, digite novamente");
            }
            combustivel = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }
}
