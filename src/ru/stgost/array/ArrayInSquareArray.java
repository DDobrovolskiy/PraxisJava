package ru.stgost.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int size = 0;
        while (size * size < array.length) {
            size++;
        }
        int index = 0;
        int[][] rsl = new int[size][size];
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl[i].length; j++) {
                if (index < array.length){
                    rsl[i][j] = array[index++];
                } else {
                    break;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        convertArray(new int[]{1, 2, 3});
    }
}
