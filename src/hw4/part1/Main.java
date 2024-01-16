package hw4.part1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "oleksiy"));
        users.add(new User(3, "petro"));
        users.add(new User(5, "pavlo"));
        users.add(new User(2, "stepan"));
        users.add(new User(7, "nikola"));
        users.add(new User(4, "nikola"));
        users.add(new User(6, "alex"));
        users.add(new User(9, "bohdan"));
        users.add(new User(8, "oleg"));
        users.add(new User(10, "valeriy"));
        users.add(new User(12, "taras"));
        users.add(new User(15, "andriy"));
        users.add(new User(13, "yuriy"));
        users.add(new User(11, "zen"));
        users.add(new User(12, "sergiy"));
        System.out.println(users.size());
        System.out.println(users);
        users.sort(new User.AssendingAgeComparator());
        System.out.println(users);
        users.sort(new User.DessendingAgeComparator());
        System.out.println(users);
        users.sort(new User.LexicographicComparator());
        System.out.println(users);
    }
}
