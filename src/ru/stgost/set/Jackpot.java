package ru.stgost.set;

import java.util.Arrays;
import java.util.HashSet;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        return new HashSet<String>(Arrays.asList(combination)).size() == 1;
    }
}
