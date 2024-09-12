package ru.mirea.lab1;

public class ex1 {
    public static void main(String[] args) {
        int[] numbers = {1, 24, 37, 64, 10};
        int sum = 0;
        double average;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = (double) sum / numbers.length;
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
}
