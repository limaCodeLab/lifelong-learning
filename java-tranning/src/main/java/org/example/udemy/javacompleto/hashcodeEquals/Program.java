package org.example.udemy.javacompleto.hashcodeEquals;

import org.example.udemy.javacompleto.hashcodeEquals.entities.Client;

public class Program {

    public static void main(String[] args) {

        String a = "Maria";
        String b = "Isabela";
        String c = "Isabela";


        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println();
        System.out.println(a.hashCode() == b.hashCode());
        System.out.println(b.hashCode() == c.hashCode());
        System.out.println();


        Client c1 = new Client("Maria", "j9sP7@example.com");
        Client c2 = new Client("Maria", "j9sP7@example.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println();
        System.out.println(c2.hashCode() == c1.hashCode());
        System.out.println(c2.equals(c1));
    }

}
