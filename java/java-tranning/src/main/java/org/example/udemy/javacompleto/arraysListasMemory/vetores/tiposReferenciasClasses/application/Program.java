package org.example.udemy.javacompleto.arraysListasMemory.vetores.tiposReferenciasClasses.application;

import org.example.udemy.javacompleto.arraysListasMemory.vetores.tiposReferenciasClasses.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    static double sum = 0.0;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i=0; i< vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        for (int i=0; i< vect.length; i++) {
            sum += vect[i].getPrice();
        }

        System.out.printf("AVERAGE HEIGHT: %.2f%n", sum / vect.length);

        sc.close();

    }
}
