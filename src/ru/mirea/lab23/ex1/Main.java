package ru.mirea.lab23.ex1;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // должно вывести 1
        System.out.println(queue.size()); // должно вывести 2
        System.out.println(queue.isEmpty()); // должно вывести false

        queue.clear();
        System.out.println(queue.isEmpty()); // должно вывести true
    }

}
