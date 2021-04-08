package ru.stgost.array;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        for (int i = 0; i < seq.length; i++) {
            if (i < 5) {
                seq[i] = '0';
            }
            if (i >= seq.length - 5) {
                seq[i] = '1';
            }
        }
        return  seq;
    }
}
