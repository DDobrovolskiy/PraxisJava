package ru.stgost.list;

import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        int first = list.indexOf(str);
        int second = list.lastIndexOf(str);
        if (first == -1) {
            return false;
        }
        if (first == second) {
            return true;
        }
        return false;
    }
}
