package ru.mirea.lab10.ex3;

public class surnameComp implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getSurname().compareTo(b.getSurname()); // Сортировка по имени
    }
}