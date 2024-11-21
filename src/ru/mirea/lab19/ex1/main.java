package ru.mirea.lab19.ex1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите ФИО клиента: ");
            String fullName = scanner.nextLine();
            System.out.print("Введите номер ИНН клиента: ");
            String tin = scanner.nextLine();
            
            client client = new client(fullName, tin);
            
            client.validateINN();
            System.out.println("\nЗаказ оформлен успешно для клиента: " + client.getName() + "\nЕго ИНН: " + client.getInn());
        } catch (InvalidInnException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
