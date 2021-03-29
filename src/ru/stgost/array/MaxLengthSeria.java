package ru.stgost.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int rsl = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] >= array[i]) {
                rsl++;
            } else {
                rsl = 1;
            }
        }
        return rsl;
    }
}
