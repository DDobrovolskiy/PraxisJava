package ru.stgost.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int sumPositive = 0;
        int simNegative = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                sumPositive++;
            } else {
                simNegative++;
            }
        }
        if (sumPositive % 2 == 0) return false;
        if (simNegative % 2 != 0) return true;
        return false;
    }
}
