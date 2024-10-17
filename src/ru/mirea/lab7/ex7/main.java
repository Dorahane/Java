package ru.mirea.lab7.ex7;

public class main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[]{
                new Magazine("Tech Today"),
                new Magazine("Fashion Weekly"),
                new Book("Effective Java", "Joshua Bloch", 2008),
                new Magazine("Science Monthly"),
                new Book("Clean Code", "Robert C. Martin", 2008)
        };

        Magazine.printMagaz(printables);
    }
}
