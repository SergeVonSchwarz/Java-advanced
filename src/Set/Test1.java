package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();              // нет порядка
        Set<String> linkedHashSet = new LinkedHashSet<>();  // есть порядок
        Set<String> treeSet = new TreeSet<>();              // сортировка

        hashSet.add("Mike");
        hashSet.add("Tom");
        hashSet.add("Ben");
        hashSet.add("Jhon");
        hashSet.add("Roy");
        hashSet.add("Kile");

        for(String name: hashSet) {
            System.out.println(name);
        }

        System.out.println("---------");

        linkedHashSet.add("Mike");
        linkedHashSet.add("Tom");
        linkedHashSet.add("Ben");
        linkedHashSet.add("Jhon");
        linkedHashSet.add("Roy");
        linkedHashSet.add("Kile");

        for(String name: linkedHashSet) {
            System.out.println(name);
        }

        System.out.println("---------");

        treeSet.add("Mike");
        treeSet.add("Tom");
        treeSet.add("Ben");
        treeSet.add("Jhon");
        treeSet.add("Roy");
        treeSet.add("Kile");

        for(String name: treeSet) {
            System.out.println(name);
        }

    }
}
