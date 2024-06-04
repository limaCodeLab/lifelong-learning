package org.example.udemy.javacompleto.orientacaoObjetos.estoque.entities;

import java.util.Scanner;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product() {
        // Contrutor 1 - Sobrecarga
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        // Contrutor 2 - Sobrecarga
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        // Contrutor 3 - Sobrecarga
    }

    /* Por convenção os get e set são sempre escritos apos os construtores */

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProductQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void removeProductQuantity(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        System.out.println();
        return name
                + ", $ " + String.format("%.2f", price)
                + ", " + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock())
                + "\n\n";
    }

}
