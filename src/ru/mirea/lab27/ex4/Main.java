package ru.mirea.lab27.ex4;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Создаем очередь с приоритетом
        PriorityQueue<Element> priorityQueue = new PriorityQueue<>();

        // Добавляем 10 элементов с разными приоритетами
        priorityQueue.add(new Element("Element1", 3));
        priorityQueue.add(new Element("Element2", 1));
        priorityQueue.add(new Element("Element3", 4));
        priorityQueue.add(new Element("Element4", 2));
        priorityQueue.add(new Element("Element5", 5));
        priorityQueue.add(new Element("Element6", 0));
        priorityQueue.add(new Element("Element7", 7));
        priorityQueue.add(new Element("Element8", 6));
        priorityQueue.add(new Element("Element9", 9));
        priorityQueue.add(new Element("Element10", 8));

        // Извлекаем и выводим на экран несколько элементов
        System.out.println("Извлечение элементов из очереди с приоритетом:");
        for (int i = 0; i < 5; i++) { // Извлекаем 5 элементов
            Element element = priorityQueue.poll(); // Извлечение элемента с наивысшим приоритетом
            if (element != null) {
                System.out.println("Извлеченный элемент: " + element);
            }
        }
    }

    // Вложенный класс для представления элементов с приоритетом
    static class Element implements Comparable<Element> {
        String name;
        int priority;

        Element(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public int compareTo(Element other) {
            // Более низкий номер приоритета - более высокий приоритет для очереди
            return Integer.compare(this.priority, other.priority);
        }

        @Override
        public String toString() {
            return name + " (приоритет: " + priority + ")";
        }
    }
}


