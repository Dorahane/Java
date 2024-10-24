package ru.mirea.lab10.ex1;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student("Лена", "Паршутина", "Информатика и выч. техника", 4, "KVBO-03-21");
        System.out.println("Информация о студенте:");
        System.out.println(student);
        System.out.print("Введите имя студента: ");
        String firstName = scanner.nextLine();
        System.out.print("Введите фамилию студента: ");
        String lastName = scanner.nextLine();
        System.out.print("Введите специальность студента: ");
        String major = scanner.nextLine();
        System.out.print("Введите курс студента: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите группу студента: ");
        String group = scanner.nextLine();
        Student student1 = new Student(firstName, lastName, major, year, group);
        System.out.println("Информация о студенте:");
        System.out.println(student1);

        scanner.close();
    }
}
