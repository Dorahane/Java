package ru.mirea.lab20.calc;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calc calc = new calc();
        boolean fun = false;
        while (!fun) {
            System.out.println("Введите числa, с которыми хотите провести действие: ");
            init<Integer, Integer> init = new init<>(scanner.nextInt(), scanner.nextInt());
            boolean validInput = false;
            Integer todo = null;
            while (!validInput) {
                System.out.println("Введите действие (1 - '+', 2 - '-', 3 - '*', 4 - '/'): ");
                try {
                    todo = scanner.nextInt();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Неверный ввод. Пожалуйста, введите число для действия.");
                    scanner.next();
                }
            }
            try{
                switch (todo) {
                    case 1:
                        try {
                            System.out.print("Ответ: ");
                            System.out.print(calc.sum(init.getFirst(), init.getSecond()));
                            fun = true;
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    case 2:
                        try {
                            System.out.print("Ответ: ");
                            System.out.print(calc.subt(init.getFirst(), init.getSecond()));
                            fun = true;
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    case 3:
                        try {
                            System.out.print("Ответ: ");
                            System.out.print(calc.mult(init.getFirst(), init.getSecond()));
                            fun = true;
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());

                        }
                    case 4:
                        try {
                            System.out.print("Ответ: ");
                            System.out.print(calc.div(init.getFirst(), init.getSecond()));
                            fun = true;
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }
}
