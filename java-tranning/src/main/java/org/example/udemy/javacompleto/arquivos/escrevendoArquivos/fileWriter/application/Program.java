package org.example.udemy.javacompleto.arquivos.escrevendoArquivos.fileWriter.application;

import java.io.*;

public class Program {

    public static void main(String[] args) {

        String[] lines = new String[] {
                "Alan",
                "Line 2",
                "Line 3",
                "Line 4",
                "Line 5"
        };

        String pathLocal = "src/main/resources/arquivoCriadoWriter.txt";

        // Criando o arquivo, mas caso nao queira substituir todo o conteudo do arquivo apenas acrescentar mais dados, basta passar o segundo parâmetro como true
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathLocal))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
