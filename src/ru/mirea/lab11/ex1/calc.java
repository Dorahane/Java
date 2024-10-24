package ru.mirea.lab11.ex1;
import java.util.Scanner;
public class calc {
    public void func(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Выберите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: Деление на ноль невозможно.");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: Неверная операция.");
                return;
        }
        System.out.println("Результат: " + result);
        scanner.close();
    }
}
