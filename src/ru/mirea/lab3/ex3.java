package ru.mirea.lab3;

public class ex3 {
    public static void main(String[] args) {
        // 1
        Double d1 = Double.valueOf(3.14);
        System.out.println("Объект d1: " + d1);
        // 2
        String strValue = "5.67";
        double parsedDouble = Double.parseDouble(strValue);
        System.out.println("\n\nПреобразованное значение из String в double: " + parsedDouble);
        // 3
        double primitiveDouble = d1.doubleValue();  // преобразуем к double
        float primitiveFloat = d1.floatValue();     // преобразуем к float
        long primitiveLong = d1.longValue();         // преобразуем к long
        int primitiveInt = d1.intValue();            // преобразуем к int
        System.out.println("\n\ndouble: " + primitiveDouble);
        System.out.println("float: " + primitiveFloat);
        System.out.println("long: " + primitiveLong);
        System.out.println("int: " + primitiveInt);
        // 4
        System.out.println("\n\nЗначение объекта d1 на консоль: " + d1);
        // 5
        String d = Double.toString(3.14);
        System.out.println("\n\nЛитерал типа double преобразован к строке: " + d);
    }
}
