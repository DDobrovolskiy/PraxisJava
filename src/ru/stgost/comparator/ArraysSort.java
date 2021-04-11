package ru.stgost.comparator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {
    public static Long[] sort(Long[] data) {
        Arrays.sort(data, Comparator.reverseOrder());
        return data;
    }
}
