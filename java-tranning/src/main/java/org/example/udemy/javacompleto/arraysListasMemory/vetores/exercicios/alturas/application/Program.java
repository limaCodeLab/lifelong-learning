package org.example.udemy.javacompleto.arraysListasMemory.vetores.exercicios.alturas.application;

import org.example.udemy.javacompleto.arraysListasMemory.vetores.exercicios.alturas.entities.Pessoa;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static String name;
    static int age;
    static double height;
    static double alturaMedia;
    static double menorIdade;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int qtdPessoas = sc.nextInt();
        sc.nextLine();
        Pessoa[] vect = new Pessoa[qtdPessoas];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Idade: ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.print("Altura: ");
            height = sc.nextDouble();
            sc.nextLine();
            vect[i] = new Pessoa(name, age, height);
        }

        alturaMedia = Arrays.stream(vect).mapToDouble(Pessoa::getHeight).average().getAsDouble();
        System.out.printf("\nAltura media = %.2f%n", alturaMedia);

        System.out.println("Pessoas com menos de 16 anos: ");
        menorIdade = 0.0;
        for (Pessoa pessoa : vect) {
            if (pessoa.getAge() < 16) {
                menorIdade++;
                System.out.println(pessoa.getName());
            }
        }
        System.out.printf("Percentual de pessoas com menos de 16 anos: %.2f%%", (menorIdade / vect.length) * 100.0 );

        sc.close();

    }

}