package ru.stgost.map;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

public class Merge1 {
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        users.stream().forEach(user -> {
            names.putIfAbsent(user.getId(), user.getName());
            names.merge(user.id, user.getSurname(), (oldV, newV) -> oldV + " " + newV);
        });
        return names;
    }

    public static class User {
        private int id;
        private String name;
        private String surname;

        public User(int id, String name, String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
