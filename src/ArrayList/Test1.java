package ArrayList;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            arrayList.add(i + 1);
        }
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());

        arrayList.remove(7);

        System.out.println("--------------");

        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("--------------");

        for(Integer x : arrayList) {
            System.out.println(x);
        }
    }
}
