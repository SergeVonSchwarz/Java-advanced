package Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int x: list
             ) {
            System.out.println(x);
        }

        System.out.println("---------");

        Iterator<Integer> iterator = list.iterator(); // old style before java 5
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
