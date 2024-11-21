package ru.mirea.lab18.ex6;

public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo t = new ThrowsDemo();

        t.printMessage("validKey");
        try {
            t.printMessage(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}