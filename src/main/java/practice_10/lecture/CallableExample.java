package practice_10.lecture;

import java.util.concurrent.*;
import java.util.function.Function;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            Thread.sleep(2000);
            return 42;
        };

        Future<Integer> future = executor.submit(task);
        System.out.println("Waiting for the result...");
        System.out.println("Result: " + future.get());

        executor.shutdown();
    }
}
