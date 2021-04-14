package ru.stgost.lambda;

import java.util.Arrays;
import java.util.Optional;

public class OptionalIfPresent {
    public static void ifPresent(int[] data) {
        max(data).ifPresent(value -> System.out.println("Max: " + value));
    }

    private static Optional<Integer> max(int[] data) {
        return Arrays.stream(data).boxed().max(Integer::compareTo);
    }
}
