package org.example.udemy.javacompleto.genericsSetMap.methodGeneric.formOne.application;

import org.example.udemy.javacompleto.genericsSetMap.methodGeneric.formOne.services.PrintService;

import java.util.Scanner;


public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* forma 01 de inicializar a classe, passando o tipo unico,
        * Entretanto se eu quiser alocar uma var de outro tipo nao sera possivel
        * pois a mesma apenas aceita tipo Interger, focando assim limitado ao tipo Integer
        */
        PrintService ps = new PrintService();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        /*Como alocamos Objeto no tipo da lista , ele deixar tbma dicionar uma String e nossa lista
         * criando assim uma vulnerabilidade de segurnaca, indepencia dos tipos alocados na lista,
         * conforme eexemplo abaixo, assim o erro .ClassCastException sera apresentado, pois o programa
         * esta esperando um Objeto do tipo Integer no primeiro lugar da lista
         */
        ps.addValue("Maria");

        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = (Integer) ps.first(); // necessario alocar um casting, caso nao tivesse alocado uma Stringo, conforme line 28
        System.out.println("First: " + x);

        sc.close();
    }
}
