package org.example.udemy.javacompleto.map;

import java.util.Map;
import java.util.TreeMap;

public class ProgramNoObject {

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        // Adiciona conteudos no map
        cookies.put("username", "Alan");
        cookies.put("password", "123456");
        cookies.put("email", "alan@gmail.com");
        cookies.put("phone", "99771122");

        // Pega o valor de uma chave
        System.out.println( "Pega o valor de uma chave 'username': " + cookies.get("username"));
        System.out.println();

        // Remove uma chave e valor
        cookies.remove("email");

        // Ao utilizar um put ele verifica se a chave existe, caso exista, a chave tem seu valor atualizado
        cookies.put("phone", "99771133");

        System.out.println("ALL COOKIES:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

        // Retorna o tamanho do map
        System.out.println("\nSIZE: " + cookies.size());

        // Verifica se contem algumas chaves e valores
        System.out.println("\nValor da chave 'email' existe? " + cookies.containsKey("email"));
        System.out.println("Contains 'phone' key? " + cookies.containsKey("phone"));
        System.out.println("Contains 'phone' value? " + cookies.containsValue("99771135555555"));
        System.out.println("Contains some value 'Alan'? " + cookies.containsValue("Alan"));

    }

}
