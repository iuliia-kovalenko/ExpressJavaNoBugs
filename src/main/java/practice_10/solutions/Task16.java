package practice_10.solutions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task16 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

        service.submit(() -> System.out.println("A " + Thread.currentThread().getName()));
        service.submit(() -> System.out.println("B " + Thread.currentThread().getName()));
        service.submit(() -> System.out.println("C " + Thread.currentThread().getName()));

        service.shutdown();

    }
}
