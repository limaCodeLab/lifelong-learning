package org.example.udemy.javacompleto.outrosTopicos;

public class OperadoresBitwise {

    static  int a, b;

    public static void main(String[] args) {

        // 0 = false, 1 = true
        // O uso desse operador se aplica a programcao de baixo nivel (low level programming).
        // Por exemplo:
        // microcontroladores, airdoino, microprocessadores, etc...

        a = 89;
        b = 60;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);

    }
}
