package org.example.udemy.javacompleto.estrCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        exercicioOito(sc);
    }

    public static void exercicioUm(Scanner sc) {
        int s1;
        System.out.println("Digite um valor inteiro: ");
        s1 = sc.nextInt();

        if (s1 >= 0) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }

    public static void exercicioDois(Scanner sc) {
        int s1;
        System.out.println("Digite um valor inteiro: ");
        s1 = sc.nextInt();

        if (s1 % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();
    }

    public static void exercicioTres(Scanner sc) {
        int A,B;
        System.out.println("Digite um valor inteiro: ");
        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("SAO MULTIPLOS");
        } else {
            System.out.println("NAO SAO MULTIPLOS");
        }

        sc.close();
    }

    public static void exercicioQuatro(Scanner sc) {
        int A,B;
        System.out.println("Digite a hora incial: ");
        A = sc.nextInt();
        System.out.println("Digite a hora final: ");
        B = sc.nextInt();

        if (A < B) {
            System.out.println("O JOGO DUROU " + (B - A) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU " + (24 - A + B) + " HORA(S)");
        }

        sc.close();
    }

    public static void exercicioCinco(Scanner sc) {

        double valorItem;
        int codigoItem = sc.nextInt();
        int qtde = sc.nextInt();

        switch (codigoItem) {
            case 1:
                valorItem = 4.00;
                break;
            case 2:
                valorItem = 4.50;
                break;
            case 3:
                valorItem = 5.00;
                break;
            case 4:
                valorItem = 2.00;
                break;
            case 5:
                valorItem = 1.50;
                break;
            default:
                valorItem = 0.0;
                System.out.println("CODIGO INVALIDO");
                break;
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorItem * qtde);
        sc.close();

    }

    public static void exercicioSeis(Scanner sc) {

        double valor = sc.nextDouble();

        if (valor >= 0 && valor <=25){
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor <=50){
            System.out.println("Intervalo (25,50]");
        } else if (valor > 50 && valor <=75) {
            System.out.println("Intervalo (50,75]");
        } else if (valor > 75 && valor <=100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        sc.close();

    }

    public static void exercicioSeisOutraForma(Scanner sc) {

        double valor = sc.nextDouble();

        if(valor <0 || valor > 100){
            System.out.println("Fora de intervalo");
        } else if (valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (valor <= 75) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }

        sc.close();

    }

    public static void exercicioSete(Scanner sc) {

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y >0){
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        sc.close();

    }

    public static void exercicioOito(Scanner sc) {

        double renda = sc.nextDouble();

        if (renda <= 2000){
            System.out.println("Isento");
        } else if (renda > 2000 && renda <= 3000){
            System.out.printf("R$ %.2f", (renda - 2000) * 0.08);
        } else if (renda > 3000 && renda <= 4500) {
            System.out.printf("R$ %.2f", (1000 * 0.08) + (renda - 3000) * 0.18);
        } else if (renda > 4500) {
            System.out.printf("R$ %.2f", (1000 * 0.08) + (1500 * 0.18) + (renda - 4500) * 0.28);
        }

        sc.close();

    }

}
