package ru.mirea.lab21.ex1;

import java.util.ArrayList;
import java.util.List;

public class spisk {
    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();

        for (T element : array) {
            list.add(element);
        }

        return list;
    }

    public static void main(String[] args) {
        // Пример с массивом строк
        String[] stringArray = {"Hello", "World", "Java"};
        List<String> stringList = convertArrayToList(stringArray);
        System.out.println("Список строк: " + stringList);

        // Пример с массивом чисел
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertArrayToList(intArray);
        System.out.println("Список чисел: " + intList);
    }
}
