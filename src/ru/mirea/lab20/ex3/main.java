package ru.mirea.lab20.ex3;

public class main {
    public static void main(String[] args) {
        Animal dog = new Animal("Buddy");
        ex1<Integer, Animal, String> obj = new ex1<>(123, dog, "Hello");
        obj.printCNames();
        System.out.println(obj);
    }
}
