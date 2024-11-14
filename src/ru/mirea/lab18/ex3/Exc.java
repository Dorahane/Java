package ru.mirea.lab18.ex3;

import java.util.Scanner;

public class Exc {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (Exception e) { // для других исключений
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Exc ex = new Exc();
        ex.exceptionDemo();
    }
}
// Qwerty - прога  выведет сообщение Invalid input. Please enter a valid integer.
// 0 -  выведет сообщение Cannot divide by zero.
// 1.2 - то же что и Qwerty
// 1 - проходит
