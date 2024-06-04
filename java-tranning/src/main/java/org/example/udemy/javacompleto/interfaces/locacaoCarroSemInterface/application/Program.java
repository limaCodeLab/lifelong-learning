package org.example.udemy.javacompleto.interfaces.locacaoCarroSemInterface.application;

import org.example.udemy.javacompleto.interfaces.locacaoCarroSemInterface.entities.CarRental;
import org.example.udemy.javacompleto.interfaces.locacaoCarroSemInterface.entities.Vehicle;
import org.example.udemy.javacompleto.interfaces.locacaoCarroSemInterface.services.BrazilTaxService;
import org.example.udemy.javacompleto.interfaces.locacaoCarroSemInterface.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String model = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dataFormatter);
        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dataFormatter);

        CarRental cr = new CarRental(start, finish, new Vehicle(model));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));



        sc.close();

    }
}
