package ru.stgost.array;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int max = ints[0];
        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            min = Math.min(min, ints[i]);
            max = Math.max(max, ints[i]);
        }
        return max - min;
    }
}
