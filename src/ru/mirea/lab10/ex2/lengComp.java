package ru.mirea.lab10.ex2;

public class lengComp implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return Integer.compare(a.getName().length(), b.getName().length()); // Сортировка по имени
    }
}
