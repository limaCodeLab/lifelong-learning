package org.example.udemy.javacompleto.interfaces.interfaceComparable;

import org.example.udemy.javacompleto.interfaces.interfaceComparable.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

    public static String employeeCsv;

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>(); // Criando uma lista de objetos Employee
        String localPathFile = "C:\\tmp\\in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(localPathFile))) {

            employeeCsv = br.readLine(); // Lendo o primeiro registro
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(","); // [ João, 3000.0 ], separando por virgula o texto
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));  // Adicionando o objeto Employee na lista
                employeeCsv = br.readLine(); // Lendo o proximo registro
            }

            Collections.sort(list); // ordenando a lista
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
