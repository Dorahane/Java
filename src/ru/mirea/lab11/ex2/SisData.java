package ru.mirea.lab11.ex2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SisData {
    public static Calendar sisFunc(){
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE,d MMMM, yyyy");
        System.out.println("Ваше системное время:" + sdf.format(now));
        Calendar sisNow = Calendar.getInstance();
        sisNow.setTime(now);
        return sisNow;
    }
}
