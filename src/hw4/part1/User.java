package hw4.part1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int age;
    private String name;

    static class LexicographicComparator implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return o1.name.compareToIgnoreCase(o2.name);
        }
    }

    static class AssendingAgeComparator implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return Integer.compare(o1.age, o2.age);
        }
    }
    static class DessendingAgeComparator implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return Integer.compare(o2.age, o1.age);
        }
    }
    static class NameLengthAssendingComparator implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {

            return o1.getName().length() - o2.getName().length();
        }
    }
    static class NameLengthDessengingComparator implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {

            return o2.getName().length() - o1.getName().length();
        }
    }
}
