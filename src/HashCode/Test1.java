package HashCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(); // уникальные ключи
        Set<Integer> set = new HashSet<>();         // уникальные значения

        map.put(1, "one");
        map.put(1, "two");

        set.add(1);
        set.add(1);

        System.out.println(map);
        System.out.println(set);
    }
}