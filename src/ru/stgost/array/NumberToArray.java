package ru.stgost.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        char[] num = String.valueOf(number).toCharArray();
        int[] rsl = new int[num.length];
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = Integer.parseInt(String.valueOf(num[rsl.length - 1 - i]));
        }
        return rsl;
    }
}
