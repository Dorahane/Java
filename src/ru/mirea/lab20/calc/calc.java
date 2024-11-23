package ru.mirea.lab20.calc;

public class calc {
    public static <T extends Integer, U extends Integer> double sum(T a, U b){
        return a.doubleValue() + b.doubleValue();
    }
    public static <T extends Integer, U extends Integer> double subt(T a, U b){
        return a.doubleValue() - b.doubleValue();
    }
    public static <T extends Integer, U extends Integer> double mult(T a, U b){
        return a.doubleValue() * b.doubleValue();
    }
    public static <T extends Integer, U extends Integer> double div(T a, U b){
        return a.doubleValue() / b.doubleValue();
    }
}
