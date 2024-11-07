package ru.mirea.lab14.ex7;

import java.util.Scanner;
import java.util.regex.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль для проверки:");
        String password = scanner.nextLine();
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";
        /*
        ^ - начало строки
        ?= - буквально если правда, то
        .* - перед символами может быть любое кол-во символов
        [a-z] - в строке должна быть хотя бы 1 буква в ниж регистре
        [A-Z] - в строке должна быть хотя бы 1 буква в верх регистре
        [a-zA-Z\d_] - в строке может содержаться любые лат буквы, цифры, и _
        {8,} - кол-во символов не менее 8
        $ - конец строки
         */
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Пароль надежный.");
        } else {
            System.out.println("Пароль ненадежный.");
        }
        scanner.close();
    }
}
