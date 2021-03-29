package ru.stgost.array;

public class MergeRows {
    public static int[] merge1(int[][] data) {
        int[] rsl = new int[data.length * data[0].length];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                rsl[index++] = data[i][j];
            }
        }
        return  rsl;
    }
}
