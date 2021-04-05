package ru.stgost.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        for (int i = 0; i < string.length; i++) {
            string[i] = Character.toUpperCase(string[i]);
        }
        return string;
    }
}
