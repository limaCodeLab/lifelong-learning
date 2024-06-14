package org.example.udemy.javacompleto.generics.wildcardTypes.delimited.problemOne.entities;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
