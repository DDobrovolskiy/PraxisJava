package ru.stgost.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningMethod {
    public static String join(List<String> strings) {
        return strings.stream().collect(Collectors.joining(System.lineSeparator(),
                "Prefix",
                "Suffix"));
    }

    public static void show(Stream<Integer> data) {
        data.forEach(System.out::println);
    }

    public static boolean check(List<String> data) {
        return data.stream().noneMatch(s -> s.isEmpty());
    }
}
