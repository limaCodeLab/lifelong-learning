package org.example.udemy.javacompleto.generics.wildcardTypes.delimited.problemOne.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }


}
