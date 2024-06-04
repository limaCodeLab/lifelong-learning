package org.example.udemy.javacompleto.orientacaoObjetos.exercicio.application;

import org.example.udemy.javacompleto.orientacaoObjetos.exercicio.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    static int numberAccount;
    static String nameHolder;
    static double deposit;


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.println("INCIANDO CADASTRO DE CONTA BANCARIA ...");
        System.out.print("Numero da conta: ");
        numberAccount = sc.nextInt();
        System.out.print("Nome do titular: ");
        sc.nextLine();
        nameHolder = sc.nextLine();


        System.out.print("Gostaria de realizar um deposito inicial (y/n)? ");
        char answer = sc.next().charAt(0);

        if (answer == 'y') {
            System.out.print("Qual valor inicial a ser depositado? ");
            account = new Account(numberAccount, nameHolder, sc.nextDouble());
        } else {
            account = new Account(numberAccount, nameHolder);
        }

        System.out.println("\nDADOS DA CONTA: " + account);

        System.out.print("Qual valor a ser depositado: ");
        account.deposit(sc.nextDouble());

        System.out.println("ATUALIZACAO DA CONTA: " + account);

        System.out.print("Qual valor do saque: ");
        account.withdraw(sc.nextDouble());

        System.out.println("ATUALIZACAO DA CONTA: " + account);


        sc.close();
    }
}
