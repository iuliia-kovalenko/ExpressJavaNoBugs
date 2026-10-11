package practice_10.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/*
Напишите программу, которая создает 3 потока для обработки элементов в списке.
Каждый поток должен обработать 3 элемента из списка и вывести их индекс и значение.
После завершения всех потоков, программа должна вывести общий результат: сколько элементов было обработано и их суммы.
 */
public class Task6 {
    static AtomicInteger count = new AtomicInteger(0);
    static int sum = 0;


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pools = Executors.newFixedThreadPool(3);
        int[] arrray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Future<?>> futureTasks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int taskNumber = i;
            // i = 0 -> array: 0, 1, 2 (0;3)
            // i = 1 -> array: 3, 4, 5 (3;6)
            // i = 2 -> array: 6, 7, 8 (6;9)
            Runnable task = () -> {
                for (int j = taskNumber*3; j < (taskNumber+1)*3; j++) {
                    System.out.println("Индекс: " + j + ", Значение: " + arrray[j]);
                    count.incrementAndGet();
                    sum += arrray[j];
                }
            };
            futureTasks.add(pools.submit(task));
        }
        for (Future<?> el: futureTasks) {
            el.get();
        };

        pools.shutdown();

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Было обработато элементов: " + count);
    }
}
