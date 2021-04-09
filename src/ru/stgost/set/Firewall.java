package ru.stgost.set;

import java.util.Arrays;
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String[] t = s.split(" ");
        for (int i = 0; i < t.length; i++) {
            if (words.contains(t[i])) {
                return "Выберите другую статью...";
            }
        }
        return "Вы сделали правильный выбор!";
    }

    public static void main(String[] args) {
        Set<String> words = Set.of("instagram", "фото", "мем", "котик");
        String s = "Криштиану Роналду опубликовал новую фотографию с детьми в instagram";
        String rsl = Firewall.checkName(s, words);
    }
}
