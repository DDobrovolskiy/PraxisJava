package ru.stgost.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ReductionWithTwoArguments {
    public static Integer collect(List<Integer> list) {
        return list.stream().reduce(5, (x, y) -> x * y);
    }

    public static String min(List<String> list) {
        return list.stream()
                .min(Comparator.comparingInt(String::length))
                .get();
    }


    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED),
                false)
                .flatMap(x -> StreamSupport.stream(
                        Spliterators.spliteratorUnknownSize(x, Spliterator.ORDERED),
                        false))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Iterator<Iterator<Integer>> it = List.of(
                List.of(1).iterator(),
                List.of(2, 3).iterator()
        ).iterator();
        flatten(it);
    }
}
