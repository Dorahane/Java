package ru.mirea.lab23.ex2;

public interface Queue {
    int size();
    boolean isEmpty();
    Object element();
    Object dequeue();
    void enqueue(Object element);
    void clear();
}
