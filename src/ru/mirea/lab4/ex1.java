package ru.mirea.lab4;
enum Seasons {
    WINTER("Зима", "Холодная пора года, когда идет снег."),
    SPRING("Весна", "Время года, когда природа пробуждается."),
    SUMMER("Лето", "Теплое время года, идеальное для отпусков."),
    AUTUMN("Осень", "Пора года, когда листья меняют цвет и опадают.");

    private String name;
    private String comm;

    Seasons(String name, String comm) {
        this.name = name;
        this.comm = comm;
    }
    public String getName() {
        return name;
    }
    public String getComm() {
        return comm;
    }
}

public class ex1 {
    public static void main(String[] args) {
        Seasons seasons = Seasons.SPRING;
        System.out.println("Мое любимое время года: " + seasons.getName());
        System.out.println("Описание: " + seasons.getComm());
    }
}
