package ru.mirea.lab6.ex4;

// имеет обычную цену товара
class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {return price;}

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + '}';
    }
}