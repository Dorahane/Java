package ru.mirea.lab10.ex3;

public class nameComp implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName()); // Сортировка по имени
    }
}
