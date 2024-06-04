package org.example.udemy.javacompleto.herancaPoliformismo.exercicios.empregados.application;

import org.example.udemy.javacompleto.herancaPoliformismo.exercicios.empregados.entities.Employee;
import org.example.udemy.javacompleto.herancaPoliformismo.exercicios.empregados.entities.OutsourcedEmployee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        Employee[] vect = new Employee[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                vect[i] = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
            } else {
                vect[i] = new Employee(name, hours, valuePerHour);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee e : vect) {
            System.out.println(e);
        }

        sc.close();

    }

}
