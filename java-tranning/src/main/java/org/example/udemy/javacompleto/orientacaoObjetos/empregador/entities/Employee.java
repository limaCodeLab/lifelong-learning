package org.example.udemy.javacompleto.orientacaoObjetos.empregador.entities;

import java.util.Scanner;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public void employeeInputData(Scanner sc) {
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Gross salary: ");
        grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        tax = sc.nextDouble();
    }

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(Scanner percentage) {
        System.out.print("Which percentage will you increase? ");
        double percentageIncrease = percentage.nextDouble();
        grossSalary += (grossSalary * percentageIncrease) / 100;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", netSalary());
    }

}
