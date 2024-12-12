package ru.mirea.lab27.ex3;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра хеш-таблицы с размером 10
        HashTab hashTab = new HashTab(10);

        // Пример данных для добавления
        String[][] data = {
                {"ключ1", "значение1"},
                {"ключ2", "значение2"},
                {"ключ3", "значение3"},
                {"ключ4", "значение4"},
                {"ключ5", "значение5"}
        };

        // Добавление элементов в хеш-таблицу
        for (String[] item : data) {
            hashTab.Add(item[0], item[1]);
            System.out.println("Добавлено: " + item[0] + " -> " + item[1]);
        }

        // Поиск элемента по ключу
        String searchKey = "ключ3";
        String foundValue = hashTab.Lookup(searchKey);
        if (foundValue != null) {
            System.out.println("Найден элемент: " + searchKey + " -> " + foundValue);
        } else {
            System.out.println("Элемент с ключом " + searchKey + " не найден.");
        }

        // Удаление элемента
        String keyToDelete = "ключ2";
        System.out.println("\nУдаление элемента с ключом: " + keyToDelete);
        hashTab.Delete(keyToDelete);

        // Проверка на наличие после удаления
        String valueAfterDeletion = hashTab.Lookup(keyToDelete);
        if (valueAfterDeletion != null) {
            System.out.println("Элемент с ключом " + keyToDelete + " все еще существует с значением: " + valueAfterDeletion);
        } else {
            System.out.println("Элемент с ключом " + keyToDelete + " успешно удалён.");
        }
    }
}


