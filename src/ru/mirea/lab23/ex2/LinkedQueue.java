package ru.mirea.lab23.ex2;

// Класс LinkedQueue теперь будет расширять AbstractQueue
public class LinkedQueue extends AbstractQueue {
    private Node head;
    private Node tail;

    public LinkedQueue() {
        head = null;
        tail = null;
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return head.data;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }

        Object result = head.data;
        head = head.next;
        size--;

        if (head == null) { // Если очередь пуста, сбрасываем tail
            tail = null;
        }
        return result;
    }

    @Override
    public void enqueue(Object element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
}