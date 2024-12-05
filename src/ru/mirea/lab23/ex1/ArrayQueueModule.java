package ru.mirea.lab23.ex1;

public class ArrayQueueModule {
    private static Object[] elements = new Object[10]; // размер массива фиксированный
    private static int head = 0; // индекс начала очереди
    private static int tail = 0; // индекс конца очереди
    private static int size = 0;  // текущий размер очереди

    // Инвариант: 0 <= size <= elements.length

    public static void enqueue(Object element) {
        // Предусловие: size < elements.length
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
        // Постусловие: size увеличен на 1
    }

    public static Object element() {
        // Предусловие: size > 0
        return elements[head];
        // Постусловие: возвращен первый элемент
    }

    public static Object dequeue() {
        // Предусловие: size > 0
        Object result = elements[head];
        head = (head + 1) % elements.length;
        size--;
        // Постусловие: размер уменьшен на 1
        return result;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        head = 0;
        tail = 0;
        size = 0;
        // Постусловие: размер равен 0
    }
}
