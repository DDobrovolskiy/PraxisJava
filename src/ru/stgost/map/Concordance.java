package ru.stgost.map;

import java.util.*;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> rsl = new HashMap<>();
        String[] strings = s.replaceAll("\\s", "").split("");
        for (int i = 0; i < strings.length; i++) {
            Character key = strings[i].split("")[0].charAt(0);
            if(rsl.containsKey(key)) {
                rsl.get(key).add(i);
            }
            rsl.putIfAbsent(key, toList(i));
        }
        return rsl;
    }

    public static List<Integer> toList(Integer i) {
        List<Integer> rsl = new ArrayList<>();
        rsl.add(i);
        return rsl;
    }
}
