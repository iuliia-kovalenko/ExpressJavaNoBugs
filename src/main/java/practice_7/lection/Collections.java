package practice_7.lection;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        //Iterator
//        Iterator<String> it = cities.iterator();
//        while(it.hasHext()) {
//            String city = it.next();
//            System.out.println(city);
//        }

        List<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Yulia");
        users.add("Andrew");
        System.out.println(users.get(1));

        System.out.println("-------------------");

        List<String> tasks = new LinkedList<>();
        tasks.add("Task1");
        tasks.add("Task2");
        tasks.add(0, "task3");
        System.out.println(tasks);

        System.out.println("---------Deque----------");
        Deque<String> deque = new ArrayDeque<>();
        deque.addLast("Task 1");
        deque.addLast("Task 2");
        deque.addFirst("Task Urgent");
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.pollLast()); // Task 2
        System.out.println(deque);

        System.out.println("---------PriorityQueue----------");
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(10); // 10 - вершина
        queue.add(5); // 5 - вершина, 10 -> правый потомок
        queue.add(20); // 5 - вершина, 20 -> правый потомок, 10 левый
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("---------HashSet----------");

        Set<String> set = new HashSet<>(); // создается 16 бакетов, массив , в каждой ячейке хранится связанный список
        set.add("Hello"); // вызывается hashCode() ->

    }
}

