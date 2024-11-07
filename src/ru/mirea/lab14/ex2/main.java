package ru.mirea.lab14.ex2;

import java.util.regex.*;

public class main {
    public static void otv(String x){
        String strok = "abcdefghijklmnopqrstuv18340";
        Pattern p = Pattern.compile(strok);
        Matcher m = p.matcher(x);
        boolean b = m.matches();
        if (b) {
            System.out.println("Правильная строка");
        }
        else {
            System.out.println("Строка не правильная");
        }
    }
    public static void main(String[] args){
        String r = "abcdefghijklmnopqrstuv18340";
        String n = "abcdefghijklmnopqrsdfstuv18340";
        otv(r);
        otv(n);
    }
}
