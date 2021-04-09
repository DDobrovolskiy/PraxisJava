package ru.stgost.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        String t = s.toUpperCase().replaceAll("\\s+","");
        Set<String> rsl = new HashSet<>(Arrays.asList(t.split("")));
        return rsl.size() == 26;
    }

    public static void main(String[] args) {
        String str = "Jackdaws love my big sphinx of quartz";
        boolean b = Pangram.checkString(str);
    }
}
