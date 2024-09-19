package ru.mirea.lab2.ex2;
import java.lang.*;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball(5.0, 10.0);
        System.out.println("Координаты 1 мячика: " + b1.getX()+", " + b1.getY());
        Scanner source = new Scanner(System.in);
        System.out.println("Введите новые x и y:");
        double x = source.nextDouble();
        double y = source.nextDouble();
        b1.setXY(x,y);
        System.out.println("Координаты перемещенного 1 мячика: " + b1.getX()+", " + b1.getY());

        Ball b2 = new Ball();
        System.out.println("Координаты 2 мячика: " + b2.getX()+", " + b2.getY());
        System.out.println("Введите новые x и y:");
        double xDisp = source.nextDouble();
        double yDisp = source.nextDouble();
        b2.move(xDisp, yDisp);
        System.out.println("Координаты перемещенного 2 мячика: " + b2.getX()+", " + b2.getY());
    }
}
