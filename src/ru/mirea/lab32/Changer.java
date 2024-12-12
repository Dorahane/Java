package ru.mirea.lab32;

import java.util.Arrays;

public class Changer {
    public static void Direction(int[] permutation, int[] direction, int mobileElement) {
        for (int i = 0; i < permutation.length; i++) {
            if (permutation[i] > mobileElement) {
                direction[i] = direction[i] * (-1);
            }
        }
    }
    public static void Element(int[] permutation, int[] direction, int i, int j) {
        int tempPermutation = permutation[i];
        permutation[i] = permutation[j];
        permutation[j] = tempPermutation;

        int tempDirection = direction[i];
        direction[i] = direction[j];
        direction[j] = tempDirection;
    }
    public static void permutation(int[] permutation, int[] direction) {
        int count = 0;
        System.out.println(Arrays.toString(permutation));
        count++;
        MovableEl movEl = new MovableEl();
        int mobileElementIndex = movEl.findEl(permutation, direction);
        while (mobileElementIndex != -1) {
            int mobileElement = permutation[mobileElementIndex];
            int nextIndex = mobileElementIndex + direction[mobileElementIndex];

            Element(permutation, direction, mobileElementIndex, nextIndex);
            Direction(permutation, direction, mobileElement);

            System.out.println(Arrays.toString(permutation));
            count++;
            mobileElementIndex = movEl.findEl(permutation, direction);
        }
        System.out.println("Общее количество перестановок: " + count);
    }
}
