package ru.stgost.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][2];
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < data.length; i++) {
            if ((data[i] >= up) || (data[i] <= down)) {
                if (flag) {
                    result[count][1] = i;
                } else {
                    result[count][0] = i;
                    result[count][1] = i;
                    flag = true;
                }
            } else {
                if (flag) {
                    count++;
                    flag = false;
                }
            }
        }
        if (flag) {
            count++;
        }

        return Arrays.copyOf(result, count);
    }
}
