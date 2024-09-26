package ru.mirea.lab3.ex1;

import java.util.*;

public class ex1_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество рандомных чисел: ");
        int n = scanner.nextInt();
        double[] rnums = new double[n];
        int i = 0;
        while (i < n) {
            rnums[i] =  Math.random();
            i ++;
        }
        System.out.println("Изначальный массив: ");
        int z = 0;
        do{
            System.out.printf("%.3f%n",rnums[z]);
            z++;
        }while (z < n);

        Arrays.sort(rnums);

        System.out.println("Отсортированный массив: ");
        int c = 0;
        do{
            System.out.printf("%.3f%n",rnums[c]);
            c++;
        }while (c < n);
    }
}
