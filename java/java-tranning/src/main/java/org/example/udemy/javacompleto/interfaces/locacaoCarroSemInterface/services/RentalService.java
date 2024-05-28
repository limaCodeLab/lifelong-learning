package org.example.udemy.javacompleto.interfaces.locacaoCarroSemInterface.services;

import org.example.udemy.javacompleto.interfaces.locacaoCarroSemInterface.entities.CarRental;
import org.example.udemy.javacompleto.interfaces.locacaoCarroSemInterface.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;
    private BrazilTaxService taxService; // nao e uma boa pratica, cria-se uma dependencia grande caso no futuro proximo mude a regra para outro pais

    public RentalService() {}

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = Math.ceil(hours) * pricePerHour; // ceil arredonda para cima
        } else {
            basicPayment = Math.ceil(hours / 24.0) * pricePerDay;
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

}
