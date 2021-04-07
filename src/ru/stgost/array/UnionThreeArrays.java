package ru.stgost.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int start = left[0];
        int finish = left[left.length - 1];
        int[] rsl = new int[middle.length + 2];
        rsl[0] = start;
        rsl[rsl.length - 1] = finish;
        for (int i = 1; i < rsl.length - 1; i++) {
            if(i % 2 != 0) {
                rsl[i] = right[i - 1];
            } else {
                rsl[i] = middle[i - 1];
            }
        }
        return rsl;
    }
}
