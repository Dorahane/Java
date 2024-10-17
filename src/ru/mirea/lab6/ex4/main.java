package ru.mirea.lab6.ex4;

public class main {
    public static void main(String[] args) {
        Priceable product = new Product("Laptop", 14999.99);
        Priceable service = new Service("Consultation", 100.00, 2);
        Priceable subscription = new Subscription("Streaming Service", 10.99, 10);

        System.out.println(product);
        System.out.println("Price: " + product.getPrice());

        System.out.println(service);
        System.out.println("Price: " + service.getPrice());

        System.out.println(subscription);
        System.out.println("Price: " + subscription.getPrice());
    }
}

