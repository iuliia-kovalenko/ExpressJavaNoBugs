package practice_10.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/*
Напишите программу, которая использует ExecutorService для создания пула потоков,
в котором несколько потоков обрабатывают задачи.
Каждая задача — это выполнение простого теста с задержкой.
Программа должна создать пул из 4 потоков, каждая задача должна быть выполнена с задержкой в 2 секунды.
После выполнения всех задач, результат должен быть выведен в главном потоке.
 */
public class Task5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int quantityPools = 4;
        int quantityTasks = 10;
        ExecutorService pools = Executors.newFixedThreadPool(quantityPools);
        List<Future<String>> futureTasks = new ArrayList<>();
        for (int i = 0; i < quantityTasks; i++) {
            Callable<String> task = () -> {
                Thread.sleep(2000);
                return "Task " + Thread.currentThread().getName();
            };
            futureTasks.add(pools.submit(task));
        }

        for (Future<String> el : futureTasks) {
            System.out.println(el.get());
        }
        pools.shutdown();
    }
}
