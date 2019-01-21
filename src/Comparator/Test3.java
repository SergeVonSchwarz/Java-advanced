package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        Collections.sort(numbers, new BackwardIntegerComparator());
        System.out.println(numbers);
    }
}

@SuppressWarnings("Duplicates")
class BackwardIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 > o2) {
            return -1;
        } else if(o1 < o2) {
            return 1;
        } else {
            return 0;
        }
    }
}