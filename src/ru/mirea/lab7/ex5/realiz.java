package ru.mirea.lab7.ex5;

public class realiz implements strManip{
    public int Count(String s) {
        return s != null ? s.length() : 0;
        // проверка на наличие символов
        // если есть символы - возращ кол-во, нету - возвр 0
    }

    public String Pos(String s) {
        if (s == null) {
            return null;
        }
        String res = "";
        //извлечение символов с нечетными индексами
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) { // Нечетные позиции в 1-индексации
                res += s.charAt(i);
            }
        }
        return res;
    }

    public String Invert(String s) {
        if (s == null) {
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    }
}
