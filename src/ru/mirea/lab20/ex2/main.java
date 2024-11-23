package ru.mirea.lab20.ex2;

public class main {
    public static void main(String[] args) {
        ex1<String, Integer, Double> obj = new ex1<>("Hello", 42, 3.14);
        obj.printCNames();
    }
}
