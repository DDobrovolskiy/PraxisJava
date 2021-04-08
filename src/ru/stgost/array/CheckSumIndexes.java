package ru.stgost.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int[] rsl = new int[data.length * data.length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j != 3) {
                    rsl[count++] = data[i][j];
                }
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
