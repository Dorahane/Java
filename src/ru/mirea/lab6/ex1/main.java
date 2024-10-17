package ru.mirea.lab6.ex1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovablePoint point = new MovablePoint(5, 10, 0, 0);
        System.out.println(point);
        int pointX, pointY;
        do {
            System.out.print("Введите скорость по X и Y для точки: ");
            pointX = scanner.nextInt();
            pointY = scanner.nextInt();
        } while ((pointX < 0)||(pointY<0));
        point = new MovablePoint(5, 10, pointX, pointY);
        System.out.println(point);

        System.out.print("Введите направление движения для точки (1-вверх, 2-вниз, 3-влево, 4-вправо): ");
        String pointDirection = scanner.next();
        switch (pointDirection.toLowerCase()) {
            case "1":
                point.moveUp(); break;
            case "2":
                point.moveDown(); break;
            case "3":
                point.moveLeft(); break;
            case "4":
                point.moveRight(); break;
            default:
                System.out.println("Неверное направление!");
        }
        System.out.println(point);

        MovableCircle circle = new MovableCircle(3, 4, 1, 1, 5);
        System.out.println(circle);
        int cirX, cirY, r;
        do {
            System.out.print("Введите скорость по X и Y для круга: ");
            cirX = scanner.nextInt();
            cirY = scanner.nextInt();
        } while ((cirX < 0)||(cirY<0));
        do {
            System.out.print("Введите радиус круга: ");
            r = scanner.nextInt();
        }while (r < 0);
        circle = new MovableCircle(3, 4, cirX, cirY, r);
        System.out.println(circle);
        System.out.print("Введите направление движения для круга (1-вверх, 2-вниз, 3-влево, 4-вправо): ");
        String circleDirection = scanner.next();
        switch (circleDirection.toLowerCase()) {
            case "1":
                circle.moveUp(); break;
            case "2":
                circle.moveDown(); break;
            case "3":
                circle.moveLeft(); break;
            case "4":
                circle.moveRight(); break;
            default:
                System.out.println("Неверное направление!");
        }
        System.out.println(circle);
        scanner.close();
    }
}
