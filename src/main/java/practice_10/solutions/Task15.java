package practice_10.solutions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task15 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(1);

        service.submit(() -> System.out.println("A"));
        service.submit(() -> System.out.println("B"));
        service.submit(() -> System.out.println("C"));


        System.out.println("Main");

        service.shutdown();

    }
}
