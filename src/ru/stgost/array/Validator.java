package ru.stgost.array;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int count = 0;
        for (int item :
                data) {
            if (item == value) {
                count++;
            }
            }
        return data.length / 2 > count;
    }
}
