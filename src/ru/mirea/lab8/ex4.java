package ru.mirea.lab8;

public class ex4 {
    // Метод для подсчета k-значных натуральных чисел
    public static int colvoDig(int k, int s) {
        return countDigits(0, k, s, true);
    }

    // Рекурсивный метод для подсчета чисел
    private static int countDigits(int digitCount, int k, int s, boolean isFirst) {
        if (digitCount == k) {
            // проверка нужного кол-ва цифр
            return s == 0 ? 1 : 0; // если по итогу оставш суммф == 0, возвращ 1
        }

        int count = 0;
        // Определяем начальные и конечные значения для цифр
        int start = isFirst ? 1 : 0; // первая цифра не может быть 0
        int end = 9; // остальные цифры от 0 до 9

        for (int i = start; i <= end; i++) {
            if (s - i >= 0) {//проверка оставшейся ф-ии
                count += countDigits(digitCount + 1, k, s - i, false);//оставш кол-во цифр, оставш сумм, цифра не первая
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int k = 3, s = 6;
        int count = colvoDig(k, s);
        System.out.println("Количество " + k + "-значных чисел со суммой цифр " + s + " = " + count);
    }
}
