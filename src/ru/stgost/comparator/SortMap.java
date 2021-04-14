package ru.stgost.comparator;

import java.util.*;

public class SortMap {
    public static Map<Integer, String> sort(Map<Integer, String> map) {
        Map<Integer, String> rls = new TreeMap<>(Comparator.reverseOrder());
        rls.putAll(map);
        return rls;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        while (iterator.hasPrevious()) {
            System.out.println("nextIndex " + iterator.nextIndex());
            System.out.println("previousIndex " + iterator.previousIndex());
            System.out.println(iterator.previous());
        }
        System.out.println();
        iterator.forEachRemaining(integer -> System.out.println(integer));
    }
}
