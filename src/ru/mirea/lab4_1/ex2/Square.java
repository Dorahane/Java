package ru.mirea.lab4_1.ex2;

public class Square extends Rectangle {
    public Square() {super();}

    public Square(double side) {super(side, side);}

    public Square(double side, String color, boolean filled) {super(side, side, color, filled);}

    public double getSide() {
        return width; // width = lenght, можем взять что-либо одно
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {setSide(side);}

    @Override
    public void setLength(double side) {setSide(side);}

    @Override
    public String toString() {return "Square[side=" + width + ", " + super.toString() + "]";}
}
