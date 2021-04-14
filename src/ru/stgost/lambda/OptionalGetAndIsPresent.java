package ru.stgost.lambda;

import java.util.Arrays;
import java.util.Optional;

public class OptionalGetAndIsPresent {
    public static int get(int[] data, int el) {
        Optional<Integer> value = indexOf(data, el);
        if (value.isEmpty()) {
            return -1;
        } else {
            return value.get();
        }
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional<Integer> value = Optional.empty();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                value = Optional.of(i);
            }
        };
        return value;
    }
}
