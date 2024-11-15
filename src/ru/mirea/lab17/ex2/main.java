package ru.mirea.lab17.ex2;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Catalog catalog = new Catalog();
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            catalog.addNode();
            System.out.print("Хотите добавить еще один элемент? (да - 1/нет - любое другое значение): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("1"));

        System.out.println("Содержимое картотеки:");
        catalog.printC();
    }
}
