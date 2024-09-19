package ru.mirea.lab2.ex3;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        while (true) {
            System.out.println("1. Добавить компьтер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер");
            System.out.println("4. Выход");
            System.out.print("Выберите опцию: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Прочитать символ новой строки

            switch (option) {
                case 1:
                    System.out.print("Введите бренд: ");
                    String brand = scanner.nextLine();
                    System.out.print("Введите модель: ");
                    String model = scanner.nextLine();
                    System.out.print("Введите цену: ");
                    int price = scanner.nextInt();
                    Computer computer = new Computer(brand, model, price);
                    shop.addComputer(computer);
                    break;

                case 2:
                    System.out.print("Введите бренд компьютера, который хотите удалить: ");
                    String removeBrand = scanner.nextLine();
                    System.out.print("Введите модель компьютера, который хотите удалить: ");
                    String removeModel = scanner.nextLine();
                    shop.removeComputer(removeBrand, removeModel);
                    break;

                case 3:
                    System.out.print("Введите бренд компьютера, который хотите найти: ");
                    String findBrand = scanner.nextLine();
                    System.out.print("Введите модель компьютера, который хотите найти: ");
                    String findModel = scanner.nextLine();
                    shop.findComputer(findBrand, findModel);
                    break;

                case 4:
                    System.out.println("Выходим...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Невозможное действие.");
            }
        }
    }
}
