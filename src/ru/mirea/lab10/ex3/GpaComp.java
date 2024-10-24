package ru.mirea.lab10.ex3;

public class GpaComp implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return Double.compare(b.getGpa(), a.getGpa());
    }
}
