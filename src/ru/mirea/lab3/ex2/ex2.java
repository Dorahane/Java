package ru.mirea.lab3.ex2;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ex2 {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Введите количество рандомных чисел: ");
            n = scanner.nextInt();
            if (n > 0) {
                break;
            } else {
                System.out.println("Пожалуйста, число больше 0.");
            }
        }

        int[] rnums = new int[n];
        int s = 0;
        while (s < n) {
            rnums[s] =  rand.nextInt(n);
            s ++;
        }
        System.out.println("Изначальный массив: ");
        for (int i = 0;  i < n; i++){
            System.out.printf("%d%n", rnums[i]);
        }

        ArrayList<Integer> cht = new ArrayList<Integer>();
        for (int i = 0;  i < n; i++){
            if (rnums[i] % 2 == 0){
                cht.add(rnums[i]);
            }
        }

        if (cht.size() == 0){
            System.out.println("В первом массиве нет четных чисел");
        }
        else {
            System.out.println("Массив с четными числами: ");
            for (int i = 0; i < cht.size(); i++) {
                System.out.printf("%d%n", cht.get(i));
            }
        }
        scanner.close();
    }
}

