package ru.mirea.lab27.ex1;

public class Main {
    public static void main(String[] args) {
        HashTab hashTab = new HashTab(10);

        // Добавление элементов
        hashTab.hashtabAdd("ключ1", "значение1");
        hashTab.hashtabAdd("ключ2", "значение2");

        // Поиск элемента
        System.out.println("Поиск ключа 'ключ1': " + hashTab.hashtabLookup("ключ1")); // значение1

        // Удаление элемента
        hashTab.hashtabDelete("ключ1");
        System.out.println("Поиск ключа 'ключ1' после удаления: " + hashTab.hashtabLookup("ключ1")); // null
    }
}