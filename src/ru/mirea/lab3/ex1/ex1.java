package ru.mirea.lab3.ex1;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ex1 {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество рандомных чисел: ");
        int n = scanner.nextInt();
        double[] rnums = new double[n];
        int i = 0;
        while (i < n) {
            rnums[i] =  rand.nextDouble();
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
