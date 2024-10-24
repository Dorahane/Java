package ru.mirea.lab11.ex2;

import java.util.Calendar;

public class main {
    public static void main(String[] args) {
        Data data = new Data();
        Calendar D = data.datFunc();
        SisData sis = new SisData();
        Calendar S = sis.sisFunc();
        if (D.before(S)) {
            System.out.println("Введенная дата раньше системной даты.");
        } else if (D.after(S)) {
            System.out.println("Введенная дата позже системной даты.");
        } else {
            System.out.println("Введенная дата совпадает с системной датой.");
        }
    }
}
