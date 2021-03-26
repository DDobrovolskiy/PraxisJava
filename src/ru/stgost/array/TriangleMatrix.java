package ru.stgost.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int number = 1;
        int[][] triangle = new int[count][];
        for (int i = 0; i < count; i++) {
            int[] cell = new int[i + 1];
            for (int y = 0; y < cell.length; y++) {
                cell[y] = number;
                number++;
            }
            triangle[i] = cell;
        }
        return triangle;
    }
}
