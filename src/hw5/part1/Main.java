package hw5.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("congratulation");
        strings.add("reservation");
        strings.add("umbrella");
        strings.add("up");
        strings.add("speed");
        strings.add("competition");
        strings.add("championship");
        strings.add("lady");
        strings.add("manager");
        strings.add("son");
        strings.add("library");
        strings.add("dog");
        strings.add("cat");
        strings.add("snake");
        strings.add("horse");
        strings.sort(String::compareTo);
        System.out.println(strings);
        List<String> collect = strings.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
        System.out.println(collect);
    }
}
