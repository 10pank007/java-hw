package hw5.part2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] ints = new int[20];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = new Random().nextInt();
        }
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        int[] array = Arrays.stream(ints).filter(value -> value % 3 == 0).toArray();
        int[] array1 = Arrays.stream(ints).filter(value -> value % 10 == 0).toArray();
        Arrays.stream(ints).forEach(System.out::println);
        int[] array2 = Arrays.stream(ints).map(operand -> operand * 3).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
