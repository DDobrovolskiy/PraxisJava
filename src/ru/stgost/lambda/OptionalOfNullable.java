package ru.stgost.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        return strings
                .stream()
                .filter(s -> Objects.equals(s, value))
                .map(Optional::ofNullable)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        System.out.println(OptionalOfNullable.findValue(
                Arrays.asList("a", "b", "c", null),
                "c"
        ));

    }
}
