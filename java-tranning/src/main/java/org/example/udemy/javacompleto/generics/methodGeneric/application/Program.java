package org.example.udemy.javacompleto.generics.methodGeneric.application;

import org.example.udemy.javacompleto.generics.methodGeneric.entities.Product;
import org.example.udemy.javacompleto.generics.methodGeneric.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Para o ponto ser separado por vírgula

        List<Product> list = new ArrayList<>();

        String path = "C:\\tmp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1]))); // Double.parseDouble converte string para double
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most expensive:");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
