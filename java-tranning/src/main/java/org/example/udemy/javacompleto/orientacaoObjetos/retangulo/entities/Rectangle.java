package org.example.udemy.javacompleto.orientacaoObjetos.retangulo.entities;

public class Rectangle {

    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0));
    }

    public String toString() {
        return "AREA = "
                + String.format("%.2f",area())
                + "\nPERIMETER = "
                + String.format("%.2f",perimeter())
                + "\nDIAGONAL = "
                + String.format("%.2f",diagonal());

    }
}
