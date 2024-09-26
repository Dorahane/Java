package ru.mirea.lab3.ex4;


public class Converter {
    private double USD_TO_RUB = 75.0;
    private double EUR_TO_RUB = 85.0;

    public double convertToRUB(double amount, String currency) {
        switch (currency.toUpperCase()) {
            case "1":
                return amount * USD_TO_RUB;
            case "2":
                return amount * EUR_TO_RUB;
            case "3":
                return amount;
            default:
                System.out.println("Невозможное действие.");
                return 0;
        }
    }
}

