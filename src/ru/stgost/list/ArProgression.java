package ru.stgost.list;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        for (int i = 2; i < data.size(); i++) {
            if ((data.get(i - 2) + data.get(i))/2 != data.get(i - 1)){
                return 0;
            }
        }
        return data.stream().mapToInt(i -> i).sum();
    }
}
