package ru.mirea.lab32;

public class MovableEl {
    public static int findEl(int[] permutation, int[] direction) {
        int index = -1;
        for (int i = 0; i < permutation.length; i++) {
            int nextElementIndex = i + direction[i];
            if (nextElementIndex >= 0 && nextElementIndex < permutation.length) {
                if (permutation[i] > permutation[nextElementIndex]) {
                    if (index == -1) {
                        index = i;
                    } else {
                        if (permutation[i] > permutation[index]) {
                            index = i;
                        }
                    }
                }
            }
        }
        return index;
    }
}