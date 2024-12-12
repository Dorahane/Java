package ru.mirea.lab27.ex2;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра хеш-таблицы с размером 10
        HashTab hashTab = new HashTab(10);

        // Словарь с 10 уникальными ключами
        String[][] data = {
                {"ключ1", "значение1"},
                {"ключ2", "значение2"},
                {"ключ3", "значение3"},
                {"ключ4", "значение4"},
                {"ключ5", "значение5"},
                {"ключ6", "значение6"},
                {"ключ7", "значение7"},
                {"ключ8", "значение8"},
                {"ключ9", "значение9"},
                {"ключ10", "значение10"}
        };

        // Добавление элементов в хеш-таблицу
        for (String[] item : data) {
            hashTab.Add(item[0], item[1]);
            System.out.println("Добавлено: " + item[0] + " -> " + item[1]);
        }

        // Проверка наличия элементов в хеш-таблице
        System.out.println("\nПроверка значений:");
        for (String[] item : data) {
            String value = hashTab.Lookup(item[0]);
            if (value != null) {
                System.out.println("Найден: " + item[0] + " -> " + value);
            } else {
                System.out.println("Не найден: " + item[0]);
            }
        }

        // Пример удаления элемента
        String keyToDelete = "ключ5";
        System.out.println("\nУдаление элемента с ключом: " + keyToDelete);
        hashTab.Delete(keyToDelete);

        // Проверка на наличие после удаления
        String valueAfterDeletion = hashTab.Lookup(keyToDelete);
        if (valueAfterDeletion != null) {
            System.out.println("Найден: " + keyToDelete + " -> " + valueAfterDeletion);
        } else {
            System.out.println("Не найден (удаление успешно): " + keyToDelete);
        }
    }
}


