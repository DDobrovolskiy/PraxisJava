package ru.stgost.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    public static Map<Integer, String> sort(Map<Integer, String> map) {
        Map<Integer, String> rls = new TreeMap<>(Comparator.reverseOrder());
        rls.putAll(map);
        return rls;
    }
}
