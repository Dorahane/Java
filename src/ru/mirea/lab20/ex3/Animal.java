package ru.mirea.lab20.ex3;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{Name: " + name + "}";
    }
}
