package ru.stgost.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                break;
            }
            sum += data[i];
        }
        return sum % 2 == 0 ? sum : 0;
    }
}
