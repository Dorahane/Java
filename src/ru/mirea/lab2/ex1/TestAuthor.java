package ru.mirea.lab2.ex1;
import java.lang.*;
import java.util.Scanner;


public class TestAuthor {
    public static void main(String[] args){
        char gen;
        Author g1 = new Author( "Unknow", "Unknow", 'n');
        System.out.println("Имя автора: " + g1.getName() + ", имейл автора: " + g1.getEmail()
                + ", гендер автора :" + g1.getGender());
        Scanner source = new Scanner(System.in);
        System.out.println("Введите имя автора: ");
        String n = source.nextLine();
        g1.setName(n);
        System.out.println("Введите имейл автора: ");
        String e = source.nextLine();
        g1.setEmail(e);
        System.out.println("Введите гендер автора (только 1 символ, m - men, w - women): ");
        gen = source.next().charAt(0);
        g1.setGender(gen);
        System.out.println("\nИмя автора: " + g1.getName() + ", имейл автора: " + g1.getEmail()
                + ", гендер автора :" + g1.getGender());
    }
}
