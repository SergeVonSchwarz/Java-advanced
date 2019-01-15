package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test3 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap();               // нет порядка
        Map<Integer, String> linkedHashMap = new LinkedHashMap();   // порядок
        Map<Integer, String> treeMap = new TreeMap<>();             // сортировка по ключу

        testMap(hashMap);
        System.out.println("--------");
        testMap(linkedHashMap);
        System.out.println("--------");
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(24, "Bob");
        map.put(12, "Sam");
        map.put(87, "Roy");
        map.put(38, "Tom");
        map.put(1500, "Lee");
        map.put(2, "Bob");

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
    }
}
