package ru.mirea.lab21.ex2;

import java.util.Arrays;

public class ex2<T> {
    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public ex2(int capacity) {
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }

    public void add(T element) {
        if (size >= array.length) {
            resize();
        }
        array[size++] = element;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newArray = (T[]) new Object[array.length * 2]; // Увеличиваем вдвое
        System.arraycopy(array, 0, newArray, 0, array.length); // Копируем старые элементы
        array = newArray; // Указываем на новый массив
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        return array[index];
    }
    public int size() {
        return size;
    }
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));}

    public static void main(String[] args) {
        ex2<Integer> intArray = new ex2<>(5);
        intArray.add(10);
        intArray.add(20);
        intArray.add(30);
        System.out.println("Массив целых чисел: " + intArray);
    }
}
