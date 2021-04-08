package ru.stgost.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            boolean flag = true;
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    flag = false;
                    continue;
                }
            }
            if (flag) {
                rsl[count++] = left[i];
            }
        }
        for (int i = 0; i < right.length; i++) {
            boolean flag = true;
            for (int j = 0; j < left.length; j++) {
                if (right[i] == left[j]) {
                    flag = false;
                    continue;
                }
            }
            if (flag) {
                rsl[count++] = right[i];
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
