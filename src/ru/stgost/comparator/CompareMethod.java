package ru.stgost.comparator;

import javax.print.DocFlavor;

public class CompareMethod {
    public static int ascendingCompare(int first, int second) {
        return first - second;
    }

    public static int descendingCompare(int first, int second) {
        return second - first;
    }
}
