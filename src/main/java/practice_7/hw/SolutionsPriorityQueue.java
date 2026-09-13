package practice_7.hw;

import java.util.PriorityQueue;

public class SolutionsPriorityQueue {
    public static void main(String[] args) {
        //Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
        System.out.println("-----------Task1------------");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(4);
        priorityQueue.add(3);
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}