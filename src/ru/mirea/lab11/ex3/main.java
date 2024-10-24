package ru.mirea.lab11.ex3;

import java.util.Date;
public class main {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("toString(): " + now);
        Student student = new Student("Иван Иванов", now);
        System.out.println(student.toString());
    }
}

