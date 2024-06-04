package org.example.udemy.javacompleto.enumComposicao.contrato.application;

import org.example.udemy.javacompleto.enumComposicao.contrato.entities.HourContract;
import org.example.udemy.javacompleto.enumComposicao.contrato.entities.Worker;
import org.example.udemy.javacompleto.enumComposicao.contrato.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static String departmentName;
    static String name;
    static WorkerLevel level;
    static Double baseSalary;
    static Date contractDate;
    static Double contractValue;


    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        departmentName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Level Number [1 - Junior, 2 - Mid Level, 3 - Senior]: ");
        level = WorkerLevel.values()[sc.nextInt() - 1];
        System.out.print("Base salary: ");
        baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, level, baseSalary, departmentName);

        System.out.print("How many");
        System.out.println(" contracts to this worker? ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            System.out.println("Enter contract #" + (i+1) + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            contractValue = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, contractValue, hours);
            worker.addContract(contract);
        }


        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();

    }
}
