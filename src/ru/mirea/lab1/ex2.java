package ru.mirea.lab1;
import java.util.Scanner; // взаимодейстие с пользователем при помощи клавы
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создётся объект Scanner

        int sum = 0, max = 0, min = 1000000;

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Введите " + size + " целых чисел:");
        int index = 0;
        while (index < size) {
            numbers[index] = scanner.nextInt();
            index++;
        }
        int i = 0;
        do {
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            i++;
        } while (i < size);

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
        scanner.close(); // завершает работу с пользователем
    }
}
