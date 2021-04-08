package ru.stgost.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][str.length];
        int commonCount = 0;
        int cellCount = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
                result[commonCount] = Arrays.copyOf(result[commonCount],cellCount);
                commonCount++;
                cellCount = 0;
                continue;
            }
            result[commonCount][cellCount++] = str[i];
        }
        result[commonCount] = Arrays.copyOf(result[commonCount],cellCount);
        return Arrays.copyOf(result, commonCount);
    }

    public static void main(String[] args) {
        split("one two".toCharArray(), ' ');
    }
}
