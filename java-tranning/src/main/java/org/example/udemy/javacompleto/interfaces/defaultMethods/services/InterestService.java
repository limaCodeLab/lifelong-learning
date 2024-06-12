package org.example.udemy.javacompleto.interfaces.defaultMethods.services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate();

    // Mehotd default utilizando em ambas as classes dos paises e depois instanciando na application, ou seja,
    // chamando o payment da interface InterestService no classe main.
    default double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}