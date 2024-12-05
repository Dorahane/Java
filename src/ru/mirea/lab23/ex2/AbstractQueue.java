package ru.mirea.lab23.ex2;

public abstract class AbstractQueue implements Queue {
    protected int size = 0; // Текущий размер очереди

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }
}