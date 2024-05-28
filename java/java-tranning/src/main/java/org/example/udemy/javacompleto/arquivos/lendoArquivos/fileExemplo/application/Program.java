package org.example.udemy.javacompleto.arquivos.lendoArquivos.fileExemplo.application;

import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        File file = new File("src/main/resources/arquivosTexto.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }


    }
}
