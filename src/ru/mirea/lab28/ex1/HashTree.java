package ru.mirea.lab28.ex1;

import java.util.*;

public class HashTree {
    public static void main(String args[]) {
        // создаем HashSet
        HashSet<String> set = new HashSet<String>();

        // добавляем элементы в HashSet используя add()
        set.add("geeks");
        set.add("practice");
        set.add("contribute");
        set.add("ide");

        System.out.println("Original HashSet: " + set);

        // преобразуем HashSet в TreeSet
        TreeSet<String> treeSet = new TreeSet<String>(set);

        // печатаем отсортированные элементы TreeSet
        System.out.println("TreeSet elements in sorted order: " + treeSet);
    }
}