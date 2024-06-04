package org.example.udemy.javacompleto.orientacaoObjetos.estoque.application;

import org.example.udemy.javacompleto.orientacaoObjetos.estoque.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static String name;
    static double price;
    static int quantity;


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Price: ");
        price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        quantity = sc.nextInt();

        Product product = new Product(name, price, quantity); // Construtor

        System.out.print("Product data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProductQuantity(quantity);

        System.out.print("Update data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProductQuantity(quantity);

        System.out.print("Product data: " + product);

        sc.close();
  
    }

}
