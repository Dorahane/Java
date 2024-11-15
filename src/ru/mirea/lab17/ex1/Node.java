package ru.mirea.lab17.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Node {
    String name;
    int age;
    Node next;

    public void readAt(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите имя: ");
                name = scanner.nextLine();
                if (name.isEmpty()) {
                    throw new IllegalArgumentException("Имя не должно быть пустым!");
                }
                break;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        while (true){
            try {
                System.out.print("Введите возраст: ");
                age = scanner.nextInt();
                if (age < 0) {
                    throw new IllegalArgumentException("Возраст не может быть отрицательным!");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Должно введено число");
            }catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());}
            scanner.nextLine();// Для обработки новой строки после ввода возраста
        }
    }

    public void printAt(){
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}
