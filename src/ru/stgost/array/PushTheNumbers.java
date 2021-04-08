package ru.stgost.array;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        int amount = array[row][column];
        int amountVCell = array[row][column];
        int amountVCell0 = array[row][column];

        int amountVcolumn = array[row][column];
        int amountVcolumn0 = array[row][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j == column) && (i < row)) {
                    array[i][j] = array[i + 1][j];
                }
                if ((j == column) && (i > row)) {
                    amountVCell0 = array[i][j];
                    array[i][j] = amountVCell;
                    amountVCell = amountVCell0;
                }
                if ((i == row) && (j < column)) {
                    array[i][j] = array[i][j + 1];
                }
                if ((i == row) && (j > column)) {
                    amountVcolumn0 = array[i][j];
                    array[i][j] = amountVcolumn;
                    amountVcolumn = amountVcolumn0;
                }
            }
        }
        array[row][column] = 0;
    }
}
