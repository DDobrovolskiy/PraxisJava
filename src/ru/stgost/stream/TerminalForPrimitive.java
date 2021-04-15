package ru.stgost.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalForPrimitive {
    private int[] data;

    public TerminalForPrimitive(int[] data) {
        this.data = data;
    }

    public long count() {
        return Arrays.stream(data).count();
    }

    public long max() {
        return Arrays.stream(data).asLongStream().max().getAsLong();
    }

    public long min() {
        return Arrays.stream(data).asLongStream().min().getAsLong();
    }

    public double avg() {
        return Arrays.stream(data).asLongStream().average().getAsDouble();
    }

    public long sum() {
        return Arrays.stream(data).asLongStream().sum();
    }

    public static List<Character> symbols(String string) {
        return string.chars().mapToObj(s->(char)s).collect(Collectors.toList());
    }
}
