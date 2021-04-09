package ru.stgost.set;

import java.util.Arrays;
import java.util.HashSet;

public class Isogram {
    public static boolean checkString(String s) {
        return s.length() == new HashSet<String>(Arrays.asList(s.split(""))).size();
    }
}
