package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("whale");
        animals.add("zebra");
        animals.add("dog");
        animals.add("bird");
        animals.add("frog");
        animals.add("lion");

        Collections.sort(animals);
        System.out.println(animals);

        System.out.println("-------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
