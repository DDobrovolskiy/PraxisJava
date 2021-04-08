package ru.stgost.array;

public class Divider {
    public static boolean check(int num, int[] ints) {
        boolean flag = true;
        for (int i = 0; i < ints.length; i++) {
            double test = Math.IEEEremainder(num, ints[i]);
            if (test != 0) {
                return  false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] ints = {2, 3, 4};
        boolean check = Divider.check(12, ints);
    }
}
