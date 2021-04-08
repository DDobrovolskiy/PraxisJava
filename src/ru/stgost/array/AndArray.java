package ru.stgost.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] rsl = new int[Math.min(left.length, right.length)];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    rsl[count++] = left[i];
                }
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
