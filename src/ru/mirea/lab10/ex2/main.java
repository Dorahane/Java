package ru.mirea.lab10.ex2;

public class main {
    public static void main(String[] args) {
        Sorting sorter = new Sorting();

        sorter.setArray();

        sorter.quicksort(new GpaComp());
        System.out.println("Студенты отсортированы по GPA (быстрая сортировка):");
        sorter.outArray();

        sorter.mergeSort();
        System.out.println("\nСтуденты отсортированы по GPA (сортировка слиянием):");
        sorter.outArray();

        sorter.quicksort(new surnameComp());
        System.out.println("\nСтуденты отсортированы по фамилии:");
        sorter.outArray();

        sorter.quicksort(new lengComp());
        System.out.println("\nСтуденты отсортированы по длине имени:");
        sorter.outArray();
    }
}
