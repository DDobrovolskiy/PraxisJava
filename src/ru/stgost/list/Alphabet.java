package ru.stgost.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        List<String> rsl = new ArrayList<>(Arrays.asList(s.split("")));
        rsl.sort(Comparator.naturalOrder());
        StringBuilder stringBuilder = new StringBuilder();
        rsl.stream().forEach(stringBuilder::append);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String text = reformat("adsadsfsdgdgdfgfd");
        System.out.println(text);
    }
}
