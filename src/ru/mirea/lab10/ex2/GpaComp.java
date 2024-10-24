package ru.mirea.lab10.ex2;

public class GpaComp implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return Double.compare(b.getGpa(), a.getGpa()); // Сортировка по убыванию
    }
}
