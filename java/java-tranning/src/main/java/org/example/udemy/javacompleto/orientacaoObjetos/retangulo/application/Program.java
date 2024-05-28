package org.example.udemy.javacompleto.orientacaoObjetos.retangulo.application;

import org.example.udemy.javacompleto.orientacaoObjetos.retangulo.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static Rectangle rectangle = new Rectangle();

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle);

        sc.close();

    }

}
