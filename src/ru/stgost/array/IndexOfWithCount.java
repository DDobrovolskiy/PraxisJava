package ru.stgost.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int cykle = 1;
        for (int i = 0; i < string.length; i++) {
            char c1 = string[i];
            if(c == c1) {
                if(number == cykle) return i;
                cykle++;
            }
        }
        return -1;
    }
}
