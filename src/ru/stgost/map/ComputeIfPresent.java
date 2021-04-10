package ru.stgost.map;

import java.util.Map;

public class ComputeIfPresent {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        for (Map.Entry<Integer, String> item : name.entrySet()) {
            name.computeIfPresent(item.getKey(), (key, value) -> value + " " + surname.get(key));
        }
        return name;
    }
}
