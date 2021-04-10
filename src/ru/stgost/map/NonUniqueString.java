package ru.stgost.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        Arrays.asList(strings).stream().forEach( s -> {
            map.computeIfPresent(s, (key, value) -> true);
            map.putIfAbsent(s, false);
        });
        return map;
    }
}
