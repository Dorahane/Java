package ru.mirea.lab28.ex3;

import java.util.Objects;

class Node {
    double key;
    String value;
    Node next;

    public Node(double key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class HashTable {
    private Node[] table;
    private int size;

    public HashTable(int size) {
        this.size = size;
        table = new Node[size];
    }

    // Хеш-функция
    private int hash(double key) {
        int hash = (int) (key * 1000) % size; // Пример простейшей хеш-функции
        return (hash + size) % size; // Обеспечиваем неотрицательный индекс
    }

    // Добавление нового элемента
    public void put(double key, String value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            // Обработка коллизий: добавляем в начало списка
            Node current = table[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Получение значения по ключу
    public String get(double key) {
        int index = hash(key);
        Node current = table[index];

        while (current != null) {
            if (Double.compare(current.key, key) == 0) {
                return current.value;
            }
            current = current.next;
        }
        return null; // Если ключ не найден
    }

    // Удаление элемента
    public void remove(double key) {
        int index = hash(key);
        Node current = table[index];
        Node previous = null;

        while (current != null) {
            if (Double.compare(current.key, key) == 0) {
                if (previous == null) {
                    table[index] = current.next; // Удаление первого узла
                } else {
                    previous.next = current.next; // Удаление узла из списка
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    // Размер таблицы
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        hashTable.put(1.1, "Значение 1.1");
        hashTable.put(2.2, "Значение 2.2");
        hashTable.put(3.3, "Значение 3.3");
        hashTable.put(1.1, "Обновленное значение 1.1"); // обновление существующего ключа

        System.out.println(hashTable.get(1.1)); // Вывод: Обновленное значение 1.1
        System.out.println(hashTable.get(2.2)); // Вывод: Значение 2.2
        System.out.println(hashTable.get(4.4)); // Вывод: null (ключ не существует)

        hashTable.remove(2.2); // Удаление ключа 2.2
        System.out.println(hashTable.get(2.2)); // Вывод: null (ключ удален)
    }
}