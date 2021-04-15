package ru.stgost.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterObject {
    public static class User {

        private String name;

        private int age;

        public User(String name, int age) {
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

    public static List<User> filter(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() > 18)
                .filter(user -> user.getName().startsWith("B"))
                .collect(Collectors.toList());
    }

    public static List<Integer> collect(int[] data) {
        return Arrays.stream(data).distinct().boxed().collect(Collectors.toList());
    }
}
