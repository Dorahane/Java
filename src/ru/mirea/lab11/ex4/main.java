package ru.mirea.lab11.ex4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;
        do {
            System.out.print("Введите год (например, 2023): ");
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            year = scanner.nextInt();
        } while (year < 1900 || year > 2100);

        int month;
        do {
            System.out.print("Введите месяц (1-12): ");
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            month = scanner.nextInt();
        } while (month < 1 || month > 12);

        int day;
        do {
            System.out.print("Введите число: ");
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            day = scanner.nextInt();
        } while (day < 1 || day > 31);

        int hours;
        do {
            System.out.print("Введите часы (0-23): ");
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            hours = scanner.nextInt();
        } while (hours < 0 || hours > 23);

        int minutes;
        do {
            System.out.print("Введите минуты (0-59): ");
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            minutes = scanner.nextInt();
        } while (minutes < 0 || minutes > 59);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hours);
        calendar.set(Calendar.MINUTE, minutes);
        calendar.set(Calendar.SECOND, 0);
        Date date = calendar.getTime();
        System.out.println("Объект Calendar:");
        System.out.println(calendar.getTime());
        System.out.println("Объект Date:");
        System.out.println(date);

        scanner.close();
    }
}

