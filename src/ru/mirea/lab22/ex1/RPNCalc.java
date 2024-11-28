package ru.mirea.lab22.ex1;

import java.util.Stack;
import java.util.Scanner;

public class RPNCalc{
    public static double calculate() {
        Stack<Double> stack = new Stack<>();
        boolean fun = false;
        while (!fun) {
            System.out.println("Введите выражение через пробел: ");
            Scanner scanner = new Scanner(System.in);
            String expression = scanner.nextLine();
            String[] tokens = expression.split("");

            for (String token : tokens) {
                switch (token) {
                    case "+":
                        try {
                            stack.push(stack.pop() + stack.pop());
                            fun = true;
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    case "-":
                        try {
                            double b = stack.pop();
                            double a = stack.pop();
                            stack.push(a - b);
                            fun = true;
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    case "*":
                        try {
                            stack.push(stack.pop() * stack.pop());
                            fun = true;
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    case "/":
                        try {
                            double b = stack.pop();
                            double a = stack.pop();
                            if (b == 0) {
                                System.out.println("Деление на 0 невозможно");
                            }
                            stack.push(a / b);
                            fun = true;
                            break;
                        }catch (ArithmeticException e){
                            System.out.println("Деление на 0 невозможно");
                        }catch (Exception e){
                            System.out.println("Ошибка " + e.getMessage());
                        }
                    default:
                        stack.push(Double.parseDouble(token));
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println("Результат: " + calculate());
    }
}