package ru.mirea.lab11.ex5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        final int SIZE = 100000; // задаём размер списка для тестирования

        // Test ArrayList
        List<Integer> arrayList = new ArrayList<>();
        long startTime, endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Insertion time: " + (endTime - startTime) + " ns");

        // Поиск элемента
        startTime = System.nanoTime();
        arrayList.contains(SIZE / 2);
        endTime = System.nanoTime();
        System.out.println("Search time: " + (endTime - startTime) + " ns");

        // Удаление элемента
        startTime = System.nanoTime();
        arrayList.remove(SIZE / 2);
        endTime = System.nanoTime();
        System.out.println("Deletion time: " + (endTime - startTime) + " ns");

        // Adding elements at the beginning
        startTime = System.nanoTime();
        arrayList.add(0, -1);
        endTime = System.nanoTime();
        System.out.println("Add at the beginning time: " + (endTime - startTime) + " ns\n");

        // Test LinkedList
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("Testing LinkedList...");

        // Вставка элементов
        startTime = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Insertion time: " + (endTime - startTime) + " ns");

        // Поиск элемента
        startTime = System.nanoTime();
        linkedList.contains(SIZE / 2);
        endTime = System.nanoTime();
        System.out.println("Search time: " + (endTime - startTime) + " ns");

        // Удаление элемента
        startTime = System.nanoTime();
        linkedList.remove(SIZE / 2);
        endTime = System.nanoTime();
        System.out.println("Deletion time: " + (endTime - startTime) + " ns");

        // Adding elements at the beginning
        startTime = System.nanoTime();
        linkedList.add(0, -1);
        endTime = System.nanoTime();
        System.out.println("Add at the beginning time: " + (endTime - startTime) + " ns");
    }
}
