package ru.mirea.lab8;
import java.util.Scanner;

public class ex12 {
    public static void nechet() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0) {
            return;
        }
        if (number % 2 != 0) {
            System.out.println(number);
        }
        nechet();
    }
    public static void main(String[] args){
        nechet();
    }
}
