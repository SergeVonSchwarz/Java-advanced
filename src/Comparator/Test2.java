package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("whale");
        animals.add("zebra");
        animals.add("dog");
        animals.add("bird");
        animals.add("frog");
        animals.add("lion");

        Collections.sort(animals, new StringLengthComporator());
        System.out.println(animals);
    }
}

class StringLengthComporator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /*
         * o1 > o2 = 1
         * o1 < o2 = -1
         * o1 == o1 = 0
         */

        if(o1.length() > o2.length()) {
            return 1;
        } else if(o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}
