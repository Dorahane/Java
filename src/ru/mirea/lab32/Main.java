package ru.mirea.lab32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность чисел через пробел: ");
        String inputNumbers = scanner.nextLine();

        System.out.print("Введите направления (1 для вправо, -1 для влево) через пробел: ");
        String inputDirections = scanner.nextLine();

        String[] numbersStrings = inputNumbers.split(" ");
        String[] directionsStrings = inputDirections.split(" ");

        int n = numbersStrings.length;
        int[] permutation = new int[n];
        int[] direction = new int[n];

        for (int i = 0; i < n; i++) {
            permutation[i] = Integer.parseInt(numbersStrings[i]);
            direction[i] = Integer.parseInt(directionsStrings[i]);
        }
        Changer.permutation(permutation, direction);
    }
}