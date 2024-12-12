package ru.mirea.lab27.ex2;

import java.util.LinkedList;

class HashTab {
    private int size; // размер хеш-таблицы
    private LinkedList<Entry>[] table; // массив списков связанных элементов

    // Вложенный класс для хранения пар ключ-значение
    private class Entry {
        String key;
        String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // Конструктор для инициализации хеш-таблицы
    public HashTab(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Хеш-функция
    private int Hash(String key) {
        return key.hashCode() % size;
    }

    // Метод для добавления ключа и значения
    public void Add(String key, String value) {
        int index = Hash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // обновление существующего значения
                return;
            }
        }
        // добавление новой записи
        table[index].add(new Entry(key, value));
    }

    // Метод для поиска значения по ключу
    public String Lookup(String key) {
        int index = Hash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.value; // возвращаем найденное значение
            }
        }
        return null; // если ключ не найден
    }

    // Метод для удаления пары ключ-значение
    public void Delete(String key) {
        int index = Hash(key);
        Entry toRemove = null;
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                toRemove = entry;
                break;
            }
        }
        if (toRemove != null) {
            table[index].remove(toRemove); // удаляем найденную запись
        }
    }
}