package org.example.udemy.javacompleto.arraysListasMemory.vetores.exercicios.dadosPessoas.application;


import org.example.udemy.javacompleto.arraysListasMemory.vetores.exercicios.dadosPessoas.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    static double altura;
    static char genero;
    static double menorAltura;
    static double maiorAltura;
    static int qtdHomens;
    static double somaAlturasMulheres;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int qtdPessoas = sc.nextInt();
        sc.nextLine();
        Pessoa[] vect = new Pessoa[qtdPessoas];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa:");
            altura = sc.nextDouble();
            System.out.print("Gemero da " + (i+1) + "a pessoa:");
            genero = sc.next().charAt(0);
            vect[i] = new Pessoa(altura, genero);
        }

        maiorAltura = vect[0].getAltura();
        menorAltura = vect[0].getAltura();
        for (Pessoa pessoa : vect) {
            if (pessoa.getAltura() > maiorAltura) {
                maiorAltura = pessoa.getAltura();
            } else if (pessoa.getAltura() < menorAltura) {
                menorAltura = pessoa.getAltura();
            }
        }
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);

        for (Pessoa pessoa : vect) {
            if (pessoa.getGenero() == 'F') {
                somaAlturasMulheres += pessoa.getAltura();
            } else {
                qtdHomens++;
            }
        }

        System.out.printf("Altura media das mulheres: %.2f%n", (somaAlturasMulheres / (vect.length - qtdHomens)));
        System.out.println("Numero de homens: " + qtdHomens);

    }
}
