package ru.mirea.lab18.ex7;

import java.util.Scanner;

public class Throw {
    public void getKey() {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
    private String getDetails(String key)throws Exception{
        if(key.isEmpty()) {
            throw new Exception( "Key set to empty string" );  //выводит ошибку
        }
        return "data for " + key; }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw new RuntimeException("An error occurred in printDetails: " + e.getMessage(), e);
        }
    }
    public static void main(String[] args) {
        Throw t = new Throw();
        t.getKey();
        try {
            t.printDetails(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
