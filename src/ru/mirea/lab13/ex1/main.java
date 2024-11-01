package ru.mirea.lab13.ex1;

public class main {
    public static void main(String[] args){
        String strok = "I like Java!!!";
        // 2
        System.out.println("Последний символ строки: "+strok.charAt(strok.length()-1));
        //3
        System.out.println("Заканчивается ли строка подстрокой \"!!!\": " + strok.endsWith("!!!"));
        // 4
        System.out.println("Начинается ли строка подстрокой \"I like\": " + strok.startsWith("I like"));
        // 5
        System.out.println("Содержит ли строка подстроку:" + strok.contains("Java"));
        // 6
        int x = strok.indexOf("Java");
        System.out.println("Позиция строки Java в строке: " + x);
        //7
        System.out.println("Замена всех символов 'a' на 'o': " + strok.replace('a','o'));
        // 8
        System.out.println("Строка в верхнем регистре:"+strok.toUpperCase());
        // 9
        System.out.println("Строка в нижнем регистре:"+strok.toLowerCase());
        // 10
        System.out.println("Вырезка строки:" + strok.substring(x,x+"Java".length()));
    }

}
