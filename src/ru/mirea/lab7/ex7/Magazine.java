package ru.mirea.lab7.ex7;

public class Magazine implements Printable{
    private String title;
    public Magazine(String title) {
        this.title = title;
    }
    public String getTitle() {return title;}

    public static void printMagaz(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                System.out.println(item.getTitle());
            }
        }
    }
}
