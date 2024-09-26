package ru.mirea.lab3.ex4;
import java.util.Scanner;

public class Shop {
    private Converter converter;

    public Shop() {
        this.converter = new Converter();
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в интернет-магазин!");
        System.out.print("Введите стоимость товара в RUB: ");
        double priceInRUB = scanner.nextDouble();

        System.out.print("Выберите валюту для оплаты (1 - USD, 2 - EUR, 3 - RUB): ");
        String currency = scanner.next();

        double convertedPrice = converter.convertToRUB(priceInRUB, currency);
        if (convertedPrice != 0) {
            System.out.printf("Стоимость товара: %.2f %s\n", convertedPrice, currency);
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.start();
    }
}
