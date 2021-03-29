package ru.stgost.array;

public class OddPrint {
    public static void print(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            if(array[i] % 2 == 0) System.out.println(array[i]);
        }
    }
}
