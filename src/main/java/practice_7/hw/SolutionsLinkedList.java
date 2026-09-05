package practice_7.hw;

import java.util.*;

public class SolutionsLinkedList {
    public static void main(String[] args) {
        //Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
        System.out.println("---------------Task1----------------");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");
        linkedList.add("fourth");
        linkedList.add("fifth");
        linkedList.forEach(System.out::println);

        //Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
        System.out.println("---------------Task2----------------");
        LinkedList<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        queue.add("fourth");
        queue.add("fifth");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        //Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.
        System.out.println("---------------Task3----------------");
        LinkedList<String> stringLinkedList = new LinkedList<>(List.of("first", "second", "third", "last"));
        if (!stringLinkedList.isEmpty()) {
            System.out.println("First element: " + stringLinkedList.getFirst());
            System.out.println("Last element: " + stringLinkedList.getLast());
        }

        //Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.
        System.out.println("---------------Task4----------------");
        LinkedList<Integer> integerLinkedList = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int sum = 0;
        for (Integer el : integerLinkedList) {
            sum += el;
        }
        System.out.println("Total sum of all elements is: " + sum);

        //Используйте ListIterator для прохода по LinkedList в обоих направлениях.
        System.out.println("---------------Task5----------------");
        LinkedList<String> strings = new LinkedList<>(Arrays.asList("first", "second", "third", "last"));
        ListIterator<String> it = strings.listIterator();
        System.out.println("--------NEXT----------");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("--------PREVIOUS----------");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}