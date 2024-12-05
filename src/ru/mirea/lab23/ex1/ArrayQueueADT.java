package ru.mirea.lab23.ex1;

public class ArrayQueueADT {
    private Object[] elements;
    private int head;
    private int tail;
    private int size;

    public ArrayQueueADT(int capacity) {
        elements = new Object[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }
    // Инвариант: 0 <= size <= elements.length
    public void enqueue(Object element) {
        // Предусловие: size < elements.length
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public Object element() {
        // Предусловие: size > 0
        return elements[head];
    }

    public Object dequeue() {
        // Предусловие: size > 0
        Object result = elements[head];
        head = (head + 1) % elements.length;
        size--;
        return result;
    }

    public int size() {return size;}
    public boolean isEmpty() {return size == 0;}

    public void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }
}