package practice_7.hw;

import java.util.ArrayDeque;

public class SolutionsArrayDeque {
    public static void main(String[] args) {
        //Создайте ArrayDeque, добавьте 5 элементов и выведите их.
        System.out.println("--------Task1---------");
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(44);
        arrayDeque.add(11);
        arrayDeque.add(3);
        arrayDeque.add(5);
        arrayDeque.add(7);
        arrayDeque.forEach(System.out::println);

        //Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
        System.out.println("--------Task2---------");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(33);
        stack.push(44);
        stack.push(10);
        stack.push(3);
        stack.push(15);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        //Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.
        System.out.println("");
        System.out.println("----------Task3----------");
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(44);
        queue.add(3);
        queue.add(39);
        queue.add(24);
        queue.add(6);
        queue.forEach(System.out::println);
        queue.addFirst(7);
        queue.addLast(88);
        System.out.println("After adding to the head and to the tail");
        queue.forEach(System.out::println);
        System.out.println("Delete first element");
        queue.poll();
        queue.forEach(System.out::println);
        System.out.println("Delete last element");
        queue.removeLast();
        queue.forEach(System.out::println);
    }
}
