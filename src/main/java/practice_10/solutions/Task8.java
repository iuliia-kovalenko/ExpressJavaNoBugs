package practice_10.solutions;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task8 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        Future<String> f1 = pool.submit(() -> {
            Thread.sleep(100);
            return "A";
        });

        Future<String> f2 = pool.submit(() -> "B");

        System.out.println(f1.get() + f2.get());
        pool.shutdown();
    }
}
