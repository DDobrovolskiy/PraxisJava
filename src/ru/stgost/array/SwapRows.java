package ru.stgost.array;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int [] test = data[src];
        data[src] = data[dst];
        data[dst] = test;
    }

    public static void SwapCols(int[][] data, int src, int dst) {
        for (int i = 0; i < data.length; i++) {
            int test = data[i][src];
            data[i][src] = data[i][dst];
            data[i][dst] = test;
        }
    }
}
