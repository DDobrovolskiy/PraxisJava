package ru.stgost.map;

import java.util.*;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        Arrays.asList(strings).stream().forEach(s -> {
            String key = s.split("")[0];
            rsl.computeIfPresent(key, (keyS, valueS) -> {
                valueS.add(s);
                return valueS;
            });
            rsl.putIfAbsent(key, toList(s));
        });
        return rsl;
    }

    public static List<String> toList(String s) {
        List<String> rsl = new ArrayList<>();
        rsl.add(s);
        return rsl;
    }
}
