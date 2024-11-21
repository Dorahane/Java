package ru.mirea.lab18.ex7;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine() ;
        printDetails(key);
        scanner.close();
    }

    public void printDetails(String key) throws Exception { // Передаем исключение вверх
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception { // Объявляем, что может выбросить
        if (key.isEmpty()) {
            throw new Exception("Ключ задан как пустая строка");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo t = new ThrowsDemo();
        try {
            t.getKey();
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Ловим исключение в main
        }
    }
}
