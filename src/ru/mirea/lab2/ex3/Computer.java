package ru.mirea.lab2.ex3;

public class Computer {
    private String brand;
    private String model;
    private int price;

    public Computer(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public int getPrice() {return price;}

    @Override
    public String toString() {
        return "Computer{brand='" + brand + "', model='" + model + "', price=" + price + "}";
    }
}
