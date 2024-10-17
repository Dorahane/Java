package ru.mirea.lab7.ex5;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strManip stringManipulator = new realiz();
        System.out.println("Введите строку:");
        String testString = scanner.nextLine();
        // подсчет символов
        int count = stringManipulator.Count(testString);
        System.out.println("Количество символов: " + count);
        // нечет позиции
        String oddChars = stringManipulator.Pos(testString);
        System.out.println("Символы на нечетных позициях: " + oddChars);
        // инвертирование
        String inverted = stringManipulator.Invert(testString);
        System.out.println("Инвертированная строка: " + inverted);
    }
}
