package ru.mirea.lab21.ex3;

public class ind {

    public static <T> T getIndex(T[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива");
        }
        return array[index];
    }

    public static void main(String[] args) {
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        int in = 1;
        String element = getIndex(stringArray, in);
        System.out.println("Элемент по индексу " + in + ": " + element);

        Integer[] integerArray = {10, 20, 30};
        int d = 0;
        Integer intElement = getIndex(integerArray, d);
        System.out.println("Элемент по индексу " + d + ": " + intElement);
    }
}