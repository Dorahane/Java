package ru.mirea.lab1;

public class ex4 {
    public static void main(String[] args) {
        int num = 10;
        double res = 0.0;
        System.out.print("Гармоническчий ряд: \n");
        while (num > 0) {
            res = res + (double) 1 / num;
            num--;
            System.out.printf("%f\n", res);
        }
    }
}
