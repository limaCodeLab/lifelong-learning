package org.example.udemy.javacompleto.genericsSetMap.wildcardTypes.delimited.problemOne.application;

import org.example.udemy.javacompleto.genericsSetMap.wildcardTypes.delimited.problemOne.entities.Circle;
import org.example.udemy.javacompleto.genericsSetMap.wildcardTypes.delimited.problemOne.entities.Rectangle;
import org.example.udemy.javacompleto.genericsSetMap.wildcardTypes.delimited.problemOne.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));
    }

    /*
    * O "? extends Shape" utilizado neste caso para indicar que alista poder ser de Shape
    * ou de qualquer outro tipos que seja um subtipo de Shape, agora o method aceita uma lista de outra
    * forma, desde que amesmo implemente Shape.
    * Obs. Nao conseguimos adiconar elementos nesta lista devido ao generic ?
    */
    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }

}
