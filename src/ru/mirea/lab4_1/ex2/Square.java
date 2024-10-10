package ru.mirea.lab4_1.ex2;

public class Square extends Rectangle {
    // Конструкторы
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side); // Ширина и длина равны
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled); // Ширина и длина равны
    }

    // Методы доступа
    public double getSide() {
        return width; // Поскольку width и length равны, можно использовать одно из них
    }

    public void setSide(double side) {
        this.width = side; // Устанавливаем ширину
        this.length = side; // Устанавливаем длину
    }

    @Override
    public void setWidth(double side) {
        setSide(side); // Переопределение метода для установки ширины
    }

    @Override
    public void setLength(double side) {
        setSide(side); // Переопределение метода для установки длины
    }

    @Override
    public String toString() {
        return "Square[side=" + width + ", " + super.toString() + "]";
    }
}
