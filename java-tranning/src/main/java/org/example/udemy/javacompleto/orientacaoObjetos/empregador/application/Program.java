package org.example.udemy.javacompleto.orientacaoObjetos.empregador.application;

import org.example.udemy.javacompleto.orientacaoObjetos.empregador.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        employee.employeeInputData(new Scanner(System.in));

        System.out.println("\nEmployee: " + employee + "\n");
        employee.increaseSalary(new Scanner(System.in));
        System.out.println("\nUpdated data: " + employee);

        sc.close();
    }

}
