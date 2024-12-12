package ru.mirea.lab28.ex2;

import java.util.HashMap;
import java.util.Map;

public class NameCount {

    // Метод для создания HashMap с 10 парами (фамилия, имя)
    public Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();

        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Сидор");
        map.put("Смирнов", "Сидор");
        map.put("Попов", "Павел");
        map.put("Кузнецов", "Иван");
        map.put("Васильев", "Александр");
        map.put("Зайцев", "Петр");
        map.put("Фёдоров", "Сидор");
        map.put("Морозов", "Павел");

        return map;
    }

    // Метод для определения количества людей с одинаковыми именами
    public int getSameFirstNameCount(Map<String, String> map) {
        Map<String, Integer> firstNameCount = new HashMap<>();

        for (String firstName : map.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }

        return (int) firstNameCount.values().stream().filter(count -> count > 1).count();
    }

    // Метод для определения количества людей с одинаковыми фамилиями
    public int getSameLastNameCount(Map<String, String> map) {
        Map<String, Integer> lastNameCount = new HashMap<>();

        for (String lastName : map.keySet()) {
            lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName, 0) + 1);
        }

        return (int) lastNameCount.values().stream().filter(count -> count > 1).count();
    }

    public static void main(String[] args) {
        NameCount nameCount = new NameCount();
        Map<String, String> map = nameCount.createMap();

        int sameFirstNameCount = nameCount.getSameFirstNameCount(map);
        int sameLastNameCount = nameCount.getSameLastNameCount(map);

        // Эти значения можно использовать дальше в программе.
        // Программа не выводит текст на экран, как было указано в требованиях.
    }
}