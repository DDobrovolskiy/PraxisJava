package ru.stgost.map;

import java.util.HashMap;
import java.util.Map;

public class KeySet {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(
                Map.of(
                        1, "root@root",
                        2, "local@local",
                        3, "host@host"
                )
        );
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }
}
