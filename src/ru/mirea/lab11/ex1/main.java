package ru.mirea.lab11.ex1;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        String developerSurname = "Иванов";
        Date dateReceived = new Date();
        System.out.println("Фамилия разработчика: " + developerSurname);
        System.out.println("Дата и время получения задания: " + dateReceived);
        calc calculator = new calc();
        calculator.func();
        Date dateSubmitted = new Date();
        System.out.println("Дата и время сдачи задания: " + dateSubmitted);
    }
}
