package ru.mirea.lab10.ex3;

public class Student {
    private String name;
    private String surname;
    private double gpa;

    Student(String name, String surname, double gpa) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getName() {return name;}
    public String getSurname() {return surname;}
    public double getGpa() {return gpa;}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gpa='" + gpa + '\'' + '}';
    }
}