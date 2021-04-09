package ru.stgost.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        int first = list.indexOf(el);
        int second = list.lastIndexOf(el);
        if (first == -1) {
            return List.of();
        }
        if (first == second) {
            return List.of();
        }
        return list.subList(first, second);
    }
}
