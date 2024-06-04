package org.example.udemy.javacompleto.estrSequencial;

import java.util.Locale;
import java.util.Scanner;

public class DigitarValores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // define a localização padrão do programa para os Estados Unidos
        Scanner sc = new Scanner(System.in);

        /* Utilizando um numero Inteiro */
        int valor;
        System.out.println("digite um valor inteiro: ");
        valor = sc.nextInt();
        System.out.println("valor inteiro digitado foi: " + valor);

        /* Utilizando um valor String */
        String x, y;
        System.out.println("digite um valor String: ");
        x = sc.next();
        y = sc.nextLine();
        System.out.println("valor String digitado foi: " + x + y );

        /* Utilizando um valor Double */
        double d;
        System.out.println("digite um valor Double: ");
        d = sc.nextDouble(); // por padrao utilizado a linguagem oadrao da maquina brasil , e US utiliza-se .
        System.out.println("valor Double digitado foi: " + d );

        /* Utilizando um valor Float */
        float f;
        System.out.println("digite um valor Float: ");
        f = sc.nextFloat();
        System.out.println("valor Float digitado foi: " + f );

        /* Utilizando um valor Boolean */
        boolean b;
        System.out.println("digite um valor Boolean: ");
        b = sc.nextBoolean();
        System.out.println("valor Boolean digitado foi: " + b );

        /* Utilizando um valor Char */
        char c;
        System.out.println("digite um valor Char: ");
        c = sc.next().charAt(0);
        System.out.println("valor Char digitado foi: " + c );

        /* Utilizando o nextLine e escrevendo em seuqencias */
        String s1, s2, s3;
        System.out.println("Diite os valores:".toUpperCase());
        sc.nextLine(); // Colocado aqui por ele entende o enter como uma caracter espaco anteriormente
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("Os valores digitados foram: ".toUpperCase());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();

    }
}
