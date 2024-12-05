package ru.mirea.lab23.ex1;

public class ArrayQueue {
    private Object[] elements;
    private int head;
    private int tail;
    private int size;

    public ArrayQueue() {
        elements = new Object[10];
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

    public Object element() {return elements[head];}

    public Object dequeue() {
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
