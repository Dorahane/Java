package ru.mirea.lab4.ex4;

public class Memory {
    private String type; // Например, DDR4
    private int size;    // В ГБ

    public Memory(String type, int size) {
        this.type = type;
        this.size = size;
    }

    // Геттеры и сеттеры
    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}
