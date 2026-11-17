package practice_10.solutions;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task13 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> future = executorService.submit(() -> {
            Thread.sleep(3000);
            return 10 + 20;
        });

        System.out.println(future.get());

        executorService.shutdown();
    }
}
