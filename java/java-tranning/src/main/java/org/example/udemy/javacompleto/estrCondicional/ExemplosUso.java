package org.example.udemy.javacompleto.estrCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExemplosUso {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        exemploIF(sc);
    }
    public static void exemploIF(Scanner sc) {

        System.out.println("Quantos minutos foram usados? ");
        int minutos = sc.nextInt();
        double conta = 50;
        if (minutos > 100){
            conta += (minutos - 100) * 2;
        }

        System.out.printf("Total da conta: R$ %.2f%n", conta);

    }
    public static void exemploSwitch(Scanner sc) {

        int valor = sc.nextInt();
        String msg = "Dia da semana: ";
        switch (valor){
            case 1:
                System.out.println(msg + "DOMINGO");
                break;
            case 2:
                System.out.println(msg + "SEGUNDA");
                break;
            case 3:
                System.out.println(msg + "TERCA");
                break;
            case 4:
                System.out.println(msg + "QUARTA");
                break;
            case 5:
                System.out.println(msg + "QUINTA");
                break;
            case 6:
                System.out.println(msg + "SEXTA");
                break;
            case 7:
                System.out.println(msg + "SABADO");
                break;
            default:
                System.out.println(msg + "DIA INVALIDO");
        }

    }

    public static void exemploTernario(Scanner sc) {

        System.out.println("Preço: ");
        double desconto;
        double preco = sc.nextDouble();
        desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);

    }

}
