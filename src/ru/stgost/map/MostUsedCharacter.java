package ru.stgost.map;

import java.util.*;
import java.util.function.Predicate;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        char rsl = ' ';
        String string = str.toLowerCase(Locale.ROOT).replaceAll("\\s", "");
        char[] chars = string.toCharArray();
        Map<Character, Integer> map = new TreeMap<>();
        for (char item : chars) {
            map.computeIfAbsent(item, key -> 1);
            map.computeIfPresent(item, (key, value) -> value + 1);
        }
        int max = map.values().stream().mapToInt(i -> i).max().getAsInt();
        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            if(item.getValue() == max) {
                rsl = item.getKey();
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String str = "Мама мыла раму";
        char rsl = MostUsedCharacter.getMaxCount(str);
    }
}
