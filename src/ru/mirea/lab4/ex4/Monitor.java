package ru.mirea.lab4.ex4;

public class Monitor {
    private String brand;
    private double size; // В дюймах

    public Monitor(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }

    // Геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}