package ru.mirea.lab8;

public class ex2 {
    public static void main(String[] args) {
        int n = 10;
        printNumbers(1, n);
    }
    public static void printNumbers(int current, int n) {
        if (current > n) {
            return;
        }
        System.out.println(current);
        printNumbers(current + 1, n);
    }
}
