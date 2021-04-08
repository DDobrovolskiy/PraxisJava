package ru.stgost.array;

import java.util.Arrays;

public class DiffArray {
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
        return Arrays.copyOf(rsl, count);
    }
}
