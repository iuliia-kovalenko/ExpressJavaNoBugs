package practice_10.solutions;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task17 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<String> future = executor.submit(() -> {
            Thread.sleep(1000);
            return "A";
        });

        System.out.println("B " + Thread.currentThread().getName());
        System.out.println(future.get() + " " + Thread.currentThread().getName());
//        System.out.println("A " + Thread.currentThread().getName());
        System.out.println("C " + Thread.currentThread().getName());

        executor.shutdown();
    }
}
