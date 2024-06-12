package org.example.udemy.javacompleto.interfaces.defaultMethods;

import org.example.udemy.javacompleto.interfaces.defaultMethods.services.BrazilInterestService;
import org.example.udemy.javacompleto.interfaces.defaultMethods.services.InterestService;

import java.util.Locale;
import java.util.Scanner;



public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        // criada a interface InterestService, pois assim podemos estaciar mais de um tipo de taxa para cada Pais em nosso exemplo
        InterestService is = new BrazilInterestService(2.0); // polimosfismo. instanciando o BrazilInterestService
        double payment = is.payment(amount, months); // polimosfismo. chamando o payment da interface InterestService

        System.out.println("Payment after " + months + " months:");
        System.out.printf("%.2f%n", payment);

        sc.close();
    }
}
