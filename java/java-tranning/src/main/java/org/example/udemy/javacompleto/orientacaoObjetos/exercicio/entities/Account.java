package org.example.udemy.javacompleto.orientacaoObjetos.exercicio.entities;

public class Account {

    private int numberAccount;
    private String nameHolder;
    private double accountBalance;
    static final double TAX = 5.0;

    public Account() {}

    public Account(int numberAccount, String nameHolder) {
        this.numberAccount = numberAccount;
        this.nameHolder = nameHolder;
    }

    public Account(int numberAccount, String nameHolder, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.nameHolder = nameHolder;
        deposit(initialDeposit);
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }

    public void withdraw(double amount) {
        accountBalance -=  amount + TAX;
    }


    public String toString() {
        return  "\nAccount " + numberAccount
                + ", Holder: " + nameHolder
                + ", Balance: $ " + String.format("%.2f", accountBalance)
                + "\n";
    }

}
