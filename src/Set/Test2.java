package Set;

import java.util.HashSet;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Mike");
        hashSet.add("Mike");
        hashSet.add("Tom");
        hashSet.add("Ben");
        hashSet.add("Ben");
        hashSet.add("Jhon");
        hashSet.add("Roy");
        hashSet.add("Kile");

        for(String name: hashSet) {
            System.out.println(name);
        }
        System.out.println("-------");

        System.out.println(hashSet.contains("Tom"));
        System.out.println("-------");
        System.out.println(hashSet.contains("Tomdd"));
        System.out.println("-------");
        System.out.println(hashSet.isEmpty());
    }
}
