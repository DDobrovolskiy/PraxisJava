package ru.stgost.array;

public class Merge {
    public static void main(String[] args) {
        int[] first = {1, 3};
        int[] second = {2, 4};
        System.out.println(merge(first, second));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRigth = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (indexLeft == left.length) {
                rsl[i] = right[indexRigth];
                indexRigth++;
                continue;
            }
            if (indexRigth == right.length) {
                rsl[i] = left[indexLeft];
                indexLeft++;
                continue;
            }
            if (left[indexLeft] <= right[indexRigth]) {
                rsl[i] = left[indexLeft];
                indexLeft++;
            } else {
                rsl[i] = right[indexRigth];
                indexRigth++;
            }
        }
        return rsl;
    }
}
