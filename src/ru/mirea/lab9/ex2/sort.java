package ru.mirea.lab9.ex2;

public interface sort {
    void quickSort(Students[] list, int low, int high);
    int partition(Students[] list, int low, int high);
}
