package org.example.udemy.javacompleto.arraysListasMemory.listas.exercicioLista.application;

import org.example.udemy.javacompleto.arraysListasMemory.listas.exercicioLista.entities.Emplyoee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static int id;
    static String name;
    static double salary;

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Emplyoee> list = new ArrayList<>();

        /* PARTE 01 - ACRESCENTANDO DADOS */

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Salary: ");
            salary = sc.nextDouble();
            list.add(new Emplyoee(id, name, salary));
        }

        /* PARTE 02 - ATUALIZANDO SALARIO DE UM FUNCIONARIO */

        System.out.print("Enter the employee id that will have salary increase: ");
        id = sc.nextInt();
        Emplyoee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        /* PARTE 03 - MOSTRANDO LISTA ATUALIZADA */

        System.out.println("List of employees: ");
        for (Emplyoee obj : list) {
            System.out.println(obj);
        }

        sc.close();

    }

    public static boolean hasId(List<Emplyoee> listEmployees, int id) {
        Emplyoee emp = listEmployees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
