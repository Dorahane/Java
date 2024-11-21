package ru.mirea.lab18.ex5;

import java.util.Scanner;

public class ThrowDemo {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThrowDemo t = new ThrowDemo();

        t.printMessage(scanner.nextLine());

    }
}
