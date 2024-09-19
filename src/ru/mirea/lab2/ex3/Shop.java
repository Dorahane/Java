package ru.mirea.lab2.ex3;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computers;

    public Shop() {
        this.computers = new ArrayList<>();
    }
    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Компьютер бренда " + computer.getBrand() + " модели " + computer.getModel() + " по цене " + computer.getPrice() +" добавлен в каталог\n");
    }

    public void removeComputer(String brand, String model) {
        Computer toRemove = null;
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand) && computer.getModel().equalsIgnoreCase(model)) {
                toRemove = computer;
                break;
            }
        }
        if (toRemove != null) {
            computers.remove(toRemove);
            System.out.println("Компьютер убран: " + toRemove + "\n");
        } else {
            System.out.println("Компьютер не найден.\n");
        }
    }

    public void findComputer(String brand, String model) {
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand) && computer.getModel().equalsIgnoreCase(model)) {
                System.out.println("Компьютер найден");
                System.out.println("Цена этого компьютера: " + computer.getPrice() + "\n");
                return;
            }
        }
        System.out.println("Компьютер не найден.\n");
    }
}
