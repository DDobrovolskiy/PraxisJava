package ru.stgost.stream;

import java.util.*;
import java.util.stream.Collectors;

public class OptionalFilter {
    public static class Worker {

        private String passport;

        private List<Child> children = new LinkedList<>();

        public Worker(String passport, List<Child> children) {
            this.passport = passport;
            this.children = children;
        }

        public String getPassport() {
            return passport;
        }

        public List<Child> getChildren() {
            return children;
        }
    }

    public static class Child {

        private String name;

        private int age;

        public Child(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<Child> defineChildren(List<Worker> workers, String passport) {
        return findByPassport(workers, passport).stream()
                .filter(worker -> worker.getChildren().size() >= 2)
                .flatMap(worker -> worker.getChildren().stream())
                .filter(children -> children.getAge() < 15)
                .collect(Collectors.toList());
    }

    public static List<Integer> retain(List<Integer> list) {
        String test = "";
        test.toLowerCase(Locale.ROOT).replaceAll("\\s", "");
        return list.stream().filter(i -> i % 4 != 0).collect(Collectors.toList());
    }

    public static boolean valid(char[] data) {
        int rsl = 0;
        for (char i :
                data) {
            if(i == '(') {
                rsl++;
            }
            if(i == ')') {
                rsl--;
            }
            if (rsl < 0){
                return false;
            }
        }
        if (rsl != 0) {
            return false;
        }
        return true;
    }

    public static Optional<Worker> findByPassport(List<Worker> workers, String passport) {
        return workers.stream()
                .filter(w -> w.getPassport().equals(passport))
                .findFirst();
    }

    public static boolean generateBy(String origin, String line) {
        Set<String> originSet = new HashSet<>(
                Arrays.asList(origin.toLowerCase().replaceAll("\\p{Punct}", "").split(" ")));
        Set<String> lineSet = new HashSet<>(
                Arrays.asList(line.toLowerCase().replaceAll("\\p{Punct}", "").split(" ")));
        return originSet.containsAll(lineSet);
    }

    public static void main(String[] args) {
        generateBy("M d s d", "d, ds, d");
    }
}
