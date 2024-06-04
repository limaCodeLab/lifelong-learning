package org.example.udemy.javacompleto.estrSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
        exercicioSeisComplexa(sc);
    }

    public static void exercicioUM(Scanner sc) {

        int s1, s2;
        System.out.println("Digite o primeiro valor: ");
        s1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        s2 = sc.nextInt();

        System.out.println("SOMA: " + (s1 + s2));
        sc.close();

        // CORRETO
    }

    public static void exercicioDois(Scanner sc) {

        double raio, area, pi = 3.14159;

        System.out.println("Digite o valor do raio: ");
        raio = sc.nextDouble(); // ERREI AQUI, ATENCAO
        area = pi * Math.pow(raio, 2);
        System.out.printf("A=%.4f%n", area);

        sc.close();

    }

    public static void exercicioTres(Scanner sc) {

        int A, B, C, D;
        System.out.println("Digites os valores: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        System.out.println("DIFERENCA: " + (A * B - C * D));

        sc.close();

        // CORRETO
    }

    public static void exercicioQuatro(Scanner sc) {

        int funcionario, horasTrabalhadas;
        double valorHora;
        System.out.println("Numero do funcionario: ");
        funcionario = sc.nextInt();
        System.out.println("Horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.println("Valor por hora: ");
        valorHora = sc.nextDouble();
        System.out.println("NUMBER: " + funcionario);
        System.out.printf("SALARY: U$ %.2f", (horasTrabalhadas * valorHora));

        sc.close();

        // CORRETO
    }

    public static void exercicioCincoSimples(Scanner sc)  {

        int qtdPecas1, qtdPecas2;
        double valorPeca1, valorPeca2, total1, total2, total;

        System.out.println("CODIGO, QUANTIDADE E VALOR PECA UM: ");
        sc.nextInt();
        qtdPecas1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        total1 = qtdPecas1 * valorPeca1;

        System.out.println("CODIGO, QUANTIDADE E VALOR PECA DOIS: ");
        sc.nextInt();
        qtdPecas2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();
        total2 = qtdPecas2 * valorPeca2;

        total = total1 + total2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();

        // CORRETO
    }

    public static void exercicioCincoComplexa(Scanner sc) {

        int qtdPecas1, qtdPecas2;
        double valorPeca1, valorPeca2, total1, total2, total;

        System.out.println("CODIGO, QUANTIDADE E VALOR PECA UM: ");
        String input = sc.nextLine();
        String[] vet = input.split(" ");
        qtdPecas1 = Integer.parseInt(vet[1]);
        valorPeca1 = Double.parseDouble(vet[2]);
        total1 = qtdPecas1 * valorPeca1;

        System.out.println("CODIGO, QUANTIDADE E VALOR PECA DOIS: ");
        input = sc.nextLine();
        vet = input.split(" ");
        qtdPecas2 = Integer.parseInt(vet[1]);
        valorPeca2 = Double.parseDouble(vet[2]);
        total2 = qtdPecas2 * valorPeca2;
        total = total1 + total2;


        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();


        // CORRETO
    }

    public static void exercicioSeisSimples(Scanner sc) {

        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", (A * C) / 2);
        System.out.printf("CIRCULO: %.3f%n", 3.14159 * (C * C));
        System.out.printf("TRAPEZIO: %.3f%n", ((A + B) * C) / 2);
        System.out.printf("QUADRADO: %.3f%n", B * B);
        System.out.printf("RETANGULO: %.3f%n", A * B);

        sc.close();

        // CORRETO
    }

    public static void exercicioSeisComplexa(Scanner sc) {

        double A, B, C;
        String inputDatas = sc.nextLine();
        String[] vet = inputDatas.split(" ");
        A = Double.parseDouble(vet[0]);
        B = Double.parseDouble(vet[1]);
        C = Double.parseDouble(vet[2]);


        System.out.printf("TRIANGULO: %.3f\n", (A * C) / 2);
        System.out.printf("CIRCULO: %.3f%n", 3.14159 * (C * C));
        System.out.printf("TRAPEZIO: %.3f\n", ((A + B) * C) / 2);
        System.out.printf("QUADRADO: %.3f%n", B * B);
        System.out.printf("RETANGULO: %.3f%n", A * B);

        sc.close();

        // CORRETO
    }

}
