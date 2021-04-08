package ru.stgost.array;

public class WordsToText {
    public static String convert(String[] words) {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result = result.concat(words[i]).concat(" ");
        }
        return result.trim();
    }

    public static void main(String[] args) {
        convert(new String[]{"First", "second"});
    }
}
