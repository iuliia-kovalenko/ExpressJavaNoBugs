package practice_10.solutions;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task14 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future =  executor.submit(() -> {
            System.out.println("Task");
            return 100;
        });

        System.out.println("Main");

        System.out.println(future.get());

        executor.shutdown();
    }
}
