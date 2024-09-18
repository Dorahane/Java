package ru.mirea.lab1;

public class ex5 {
    public static int Fact(int f) {
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res = res * i;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Fact(6) - Fact(4));
    }
}
