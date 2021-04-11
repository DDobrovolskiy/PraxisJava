package ru.stgost.comparator;

import java.util.Comparator;

public class NaturalOrder {
    public static Comparator<String> naturalOrder() {
        Comparator<String> comparator = Comparator.nullsLast(Comparator.naturalOrder());
        return comparator;
    }
}
