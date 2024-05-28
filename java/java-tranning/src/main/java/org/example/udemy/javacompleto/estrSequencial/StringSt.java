package org.example.udemy.javacompleto.estrSequencial;

public class StringSt {

    static String varString = "Hello";
    static boolean varBoolean = true;
    static int varInt = 10;
    static double varDouble = 10.9888885;
    static char varChar = 'a';
    static float varFloat = 10.96f;

    public static void main(String[] args) {
        print();
        println();
        printf();
    }

    public static void println() {
        System.out.println("Atalho de println (sout)");
        System.out.println("Testando println " + varString + " de Strings \n");
    }
    public static void printf() {
        System.out.print("Atalho de printf (souf)\n");
        System.out.printf("Testando printf %s de String\n", varString);
        System.out.printf("Testando printf %b de Boolean\n", varBoolean);
        System.out.printf("Testando printf %d de Int\n", varInt);
        System.out.printf("Testando printf %f de Double\n", varDouble);
        System.out.printf("Testando printf %c de Char\n", varChar);
        System.out.printf("Testando printf %.2f de Float\n\n", varFloat);
    }

    public static void print() {
        System.out.print("Testando print ");
        System.out.print("Testando print");

    }

}
