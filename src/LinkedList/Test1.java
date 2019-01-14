package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < 10; i++) {
            linkedList.add(i + 1);
        }

        System.out.println(linkedList.get(2));
        System.out.println(linkedList.size());
        System.out.println(linkedList.remove(7));
        System.out.println("-----");
        System.out.println(linkedList);
    }
}
