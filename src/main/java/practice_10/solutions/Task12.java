package practice_10.solutions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task12 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(()-> {
            System.out.println("Task");
        });

        System.out.println("Main");

        executorService.shutdown();
    }
}
