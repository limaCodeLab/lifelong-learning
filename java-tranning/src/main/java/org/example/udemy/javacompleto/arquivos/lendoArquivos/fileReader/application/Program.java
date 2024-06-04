package org.example.udemy.javacompleto.arquivos.lendoArquivos.fileReader.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        String pathLocal = "src/main/resources/arquivosTexto.txt";

        // Lendo o conteudo de um arquivo utilizando o try with resources, melhor pratica, pois nao precisa ficar instanciando e fechando variaveis
        try (BufferedReader br = new BufferedReader(new FileReader(pathLocal))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
