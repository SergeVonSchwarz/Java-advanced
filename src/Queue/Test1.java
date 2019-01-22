package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test1 {
    public static void main(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(2);
        Person p3 = new Person(3);
        Person p4 = new Person(4);

        Queue<Person> people = new LinkedList<>();
        people.add(p3);
        people.add(p2);
        people.add(p4);
        people.add(p1);

        for (Person person: people
             ) {
            System.out.println(person);
        }

        System.out.println("---------");

        Queue<Person> people1 = new ArrayBlockingQueue<Person>(10);
        people1.add(p3);
        people1.add(p2);
        people1.add(p4);
        people1.add(p1);

        System.out.println(people1.remove()); // remove first
        System.out.println("---------");
        System.out.println(people1.peek());   // show first
        System.out.println("---------");
        for (Person person: people1
                ) {
            System.out.println(person);
        }
    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}