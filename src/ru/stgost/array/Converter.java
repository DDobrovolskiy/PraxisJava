package ru.stgost.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int lenght = 0;
        for (int i = 0; i < array.length; i++) {
            lenght += array[i].length;
        }
        int size = 0;
        while (size * size < lenght) {
            size++;
        }
        int row = 0;
        int cell = 0;
        int[][] rsl = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rsl[row][cell++] = array[i][j];
                if (cell == size){
                    cell = 0;
                    row++;
                }
            }
        }
        return rsl;
    }
}
