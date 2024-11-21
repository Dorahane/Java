package ru.mirea.lab18.ex8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner scanner = new Scanner(System.in);
        String key;
        boolean b = false;
        while (!b) {
            try {
                key = scanner.nextLine();
                printDetails(key);
                b = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Попробуйте еще раз.");
            }
        }
        scanner.close();
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Ключ задан как пустая строка");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo t = new ThrowsDemo();
        t.getKey();
    }
}
