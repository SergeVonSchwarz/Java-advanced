package Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test2 {
    public static void main(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(2);
        Person p3 = new Person(3);
        Person p4 = new Person(4);

        Queue<Person> people = new ArrayBlockingQueue<Person>(3);
        System.out.println(people.offer(p3));
        System.out.println(people.offer(p2));
        System.out.println(people.offer(p4));
        System.out.println(people.offer(p1));
    }
}
