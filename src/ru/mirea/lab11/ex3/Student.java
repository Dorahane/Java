package ru.mirea.lab11.ex3;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String formatBirthDate(String pattern) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat(pattern);
        return dateFormatter.format(birthDate);
    }

    @Override
    public String toString() {
        SimpleDateFormat defaultFormatter = new SimpleDateFormat("EEEE, d MMMM yyyy");
        return "Студент: " + name + ", Дата рождения: " + defaultFormatter.format(birthDate);
    }
}

