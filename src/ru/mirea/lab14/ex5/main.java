package ru.mirea.lab14.ex5;

import java.util.regex.*;
import java.util.Scanner;

public class main {
    static public void rasch(String inp){
        String regex = "^(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/(\\d{4})$";
        /* ^ - начало строки
        0[1-9] - числа от 01-09
        [12]\\d - числа от 11-29
        3[01] - числа 30 и 31
        $ - конец строки
         */
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inp);

        if (!matcher.matches()) {
            System.out.println("Неправильная дата");
            return;
        }
        String[] num = inp.split("/");
        int day = Integer.parseInt(num[0]);
        int month = Integer.parseInt(num[1]);
        int year = Integer.parseInt(num[2]);

        if (year < 1900 || year > 9999) {
            System.out.println("Неправильная дата");
            return;
        }
        int maxDay = 31;
        switch (month) {
            case 4: case 6: case 9: case 11:
                maxDay = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
                break;
        }
        if (day > maxDay) {
            System.out.println("Неправильная дата");
        } else {
            String norm = (day < 10 ? "0" + day : day) + "/" + (month < 10 ? "0" + month : month) + "/" + year;
            System.out.println(norm);
        }
    }

    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату (день/месяц/год):");
        String input = scanner.nextLine();
        rasch(input);
        scanner.close();
    }
}
