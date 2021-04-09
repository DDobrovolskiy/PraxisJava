package ru.stgost.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> rsl = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            double t = first * Math.pow(denominator,(i - 1));
            rsl.add((int) t);
        }
        return rsl.stream().mapToInt(i -> i).sum();
    }
}
