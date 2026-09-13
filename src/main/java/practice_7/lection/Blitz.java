package practice_7.lection;

import java.util.*;

public class Blitz {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("banana");
//        set.add("apple");
//        set.add("orange");
//        set.add("lemon");
//        set.add("grapes");
//        set.add("banana");
//
//        for (String s: set) {
//            System.out.print(s + " ");
//        }

        Set<Person> set = new TreeSet<>(Comparator.comparing(p -> p.name));
//        Set<Person> setWithoutComparator = new TreeSet<>();
        set.add(new Person("alex"));
        set.add(new Person("bob"));
        set.add(new Person("anna"));
        set.add(new Person("anna"));

//        setWithoutComparator.add(new Person("alex"));
//        setWithoutComparator.add(new Person("bob"));
//        setWithoutComparator.add(new Person("anna"));
//        setWithoutComparator.add(new Person("anna"));
//
        System.out.println(set.size());

        System.out.println("--------------------------");
//        List<String> list = Arrays.asList("A", "B", "C");
//        list.set(1, "X");
//        list.add("D");
//        System.out.println(list);

        List<String> list = new ArrayList<>(List.of("A", "B", "C"));
        for (String s : list) {
            if (s.equals("B")) {
                list.remove(s);
            }
        }
        System.out.println(list);

        System.out.println("--------------------------");
        Map<String, String> map = new HashMap<>();
        map.put(null, "First");
        map.put(null, "Second");

        System.out.println(map.get(null));

        System.out.println("--------------------------");

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(10);
        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println("--------------------------");

        List<Integer> list1 = new ArrayList<>();
        list1.add(0, 13);
        System.out.println(list1.size());

        System.out.println("------------PriorityQueue--------------");

//        PriorityQueue<Person> queue2 = new PriorityQueue<>(Comparator.comparing(person -> person.name));
//        PriorityQueue<Person> queue3 = new PriorityQueue<>();
//        queue3.add(new Person("A"));
//        queue3.add(new Person("B"));
//        System.out.println(queue3.poll().name);
//        System.out.println(queue3.poll().name);
//        System.out.println(queue3.poll().name);
//        System.out.println(queue3.size());


        System.out.println("------------PriorityQueue--------------");

        PriorityQueue<Person> queue4 = new PriorityQueue<>();
        queue4.add(new Person("C"));
        queue4.add(new Person("A"));
        queue4.add(new Person("B"));
        while (!queue4.isEmpty()) {
            System.out.println(queue4.poll().name);
        }


    }
}

class Person implements Comparable<Person>{
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
//        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}