package org.example.udemy.javacompleto.outrosTopicos;

public class ManipulandoString {

    static  String texto = "dabce GHJTL ABC abc DERGH                 ";

    public static void main(String[] args) {

        System.out.println(texto);
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
        System.out.println(texto.trim());
        System.out.println(texto.length());
        System.out.println(texto.charAt(0));
        System.out.println(texto.indexOf("a"));
        System.out.println(texto.lastIndexOf("a"));
        System.out.println(texto.substring(2));
        System.out.println(texto.substring(2, 5));
        System.out.println(texto.replace("a", "X"));
        System.out.println(texto.replace("ABC", "xyz"));
    }

}
