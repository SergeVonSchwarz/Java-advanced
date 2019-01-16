package Set;

import java.util.HashSet;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>();

        hashSet1.add(0);
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);
        hashSet1.add(5);


        hashSet2.add(2);
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(6);
        hashSet2.add(7);

        System.out.println("hs1 " + hashSet1);
        System.out.println("hs2 " + hashSet2);

        System.out.println("-------");

        // union - объединение множеств
        Set<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);

        System.out.println("union " + union);
        System.out.println("-------");

        // intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(hashSet1);
        intersection.retainAll(hashSet2);

        System.out.println("intersection " + intersection);
        System.out.println("-------");

        // difference - разность множеств
        Set<Integer> difference = new HashSet<>(hashSet1);
        difference.removeAll(hashSet2);

        System.out.println("difference " + difference);
        System.out.println("-------");
    }
}
