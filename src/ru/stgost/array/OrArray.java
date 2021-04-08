package ru.stgost.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[count++] = left[i];
        }
        for (int j = 0; j < right.length; j++) {
            boolean flag = true;
            for (int i = 0; i < rsl.length; i++) {
                if (rsl[i] == right[j]) {
                    flag = false;
                    continue;
                }
            }
            if (flag) {
                rsl[count++] = right[j];
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
