package ru.stgost.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] rsl = new int[left.length * left[0].length];
        int index = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                rsl[index++] = Math.max(left[i][j], right[i][j]);
            }
        }
        return rsl;
    }
}
