package ru.stgost.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] result = new int[n];
        result[0] = a;
        result[1] = b;
        int c = a + b;
        for (int i = 2; i < result.length; i++) {
            result[i] = c;
            c += result[i];
        }
        return result;
    }
}
