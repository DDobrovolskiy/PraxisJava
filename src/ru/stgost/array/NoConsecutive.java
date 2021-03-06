package ru.stgost.array;

public class NoConsecutive {
    public static int find(int[] data) {
        int result = -1;
        for (int i = 1; i < data.length; i++) {
            if (data[i] - data[i - 1] != 1) {
                return data[i];
            }
        }
        return result;
    }
}
