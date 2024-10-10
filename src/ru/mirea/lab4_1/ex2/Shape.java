package ru.mirea.lab4_1.ex2;

public abstract class Shape {
    protected String color; // Цвет фигуры
    protected boolean filled; // Заполненность фигуры

    // Конструкторы
    public Shape() {
        this.color = "unknown";
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Методы доступа
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Абстрактные методы
    public abstract double getArea(); // Площадь
    public abstract double getPerimeter(); // Периметр

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}