package HashCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>(); // уникальные ключи
        Set<Person> set = new HashSet<>();         // уникальные значения

        Person p1 = new Person(1, "Bob");
        Person p2 = new Person(2, "Ann");

        map.put(p1, "one");
        map.put(p2, "one");

        set.add(p1);
        set.add(p2);

        System.out.println(map);
        System.out.println(set);

        System.out.println("------------------------------------");

        Map<Person, String> map1 = new HashMap<>(); // уникальные ключи
        Set<Person> set1 = new HashSet<>();         // уникальные значения

        Person p3 = new Person(1, "Bob");
        Person p4 = new Person(1, "Bob");

        map1.put(p3, "one");
        map1.put(p4, "one");

        set1.add(p3);
        set1.add(p4);

        System.out.println(map1);
        System.out.println(set1);
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}