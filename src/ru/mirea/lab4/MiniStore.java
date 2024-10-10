package ru.mirea.lab4;

import java.util.Scanner;
enum Category {
    ELECTRONICS,
    CLOTHING,
    BOOKS
}

enum Item {
    PHONE("PHONE",13999, Category.ELECTRONICS),
    LAPTOP("LAPTOP",26000, Category.ELECTRONICS),
    T_SHIRT("T_SHIRT",500, Category.CLOTHING),
    JEANS("JEANS",3000, Category.CLOTHING),
    NOVEL("NOVEL", 2500, Category.BOOKS),
    MAGAZINE("MAGAZINE", 100, Category.BOOKS);

    private String name;
    private double price;
    private Category category;

    Item(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String getName() {return name;}
    public double getPrice(){return price;}
    public Category getCategory() {return category;}
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

class Cart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
            System.out.println(item.getName() + " добавлен в корзину.");
        } else {
            System.out.println("Корзина полна!");
        }
    }

    public void viewCart() {
        System.out.println("Товары в корзине:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i].getName());
            System.out.println(items[i].getPrice());
        }
    }

    public void checkout() {
        if (itemCount == 0) {
            System.out.println("Корзина пуста! Невозможно завершить покупку.");
            return;
        }
        double total = 0;
        double count = 0;
        System.out.println("Содержимое корзины:");
        for (int i = 0; i < itemCount; i++) {
            if (items[i] != null) {
                String nm = items[i].getName();
                double pr = items[i].getPrice();
                System.out.println(nm+' '+pr);
                count = items[i].getPrice();
                total += count;
                count = 0;
            }
        }
        System.out.println("Итого: " + total);
        System.out.println("Спасибо за покупку!");
        itemCount = 0;
        items = new Item[10];
        count = 0;
    }
}

public class MiniStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User("user", "01");

        System.out.println("Введите логин:");
        String username = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        if (!user.authenticate(username, password)) {
            System.out.println("Неверный логин или пароль.");
            return;
        }
        System.out.println("Аутентификация успешна!");

        Cart cart = new Cart();
        boolean running = true;

        while (running) {
            System.out.println("Выберите действие:");
            System.out.println("1. Просмотреть каталоги товаров");
            System.out.println("2. Просмотреть товары определенного каталога");
            System.out.println("3. Выбрать товар в корзину");
            System.out.println("4. Покупка товаров в корзине");
            System.out.println("5. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Каталоги товаров:");
                    for (Category category : Category.values()) {
                        System.out.println("- " + category);
                    }
                    break;
                case 2:
                    System.out.println("Введите название категории (ELECTRONICS, CLOTHING, BOOKS):");
                    String inputCategory = scanner.nextLine();
                    try {
                        Category category = Category.valueOf(inputCategory.toUpperCase());
                        System.out.println("Товары в категории " + category + ":");
                        for (Item item : Item.values()) {
                            if (item.getCategory() == category) {
                                System.out.println("- " + item.getName());
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Неверная категория.");
                    }
                    break;
                case 3:
                    System.out.println("Введите название товара для добавления в корзину:");
                    String inputItem = scanner.nextLine();
                    try {
                        Item item = Item.valueOf(inputItem.toUpperCase());
                        cart.addItem(item);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Неверный товар.");
                    }
                    break;
                case 4:
                    cart.checkout();
                    running = false;
                    break;
                case 5:
                    System.out.println("Спасибо, что воспользовались нашим интернет-магазином!");
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
    }
}
