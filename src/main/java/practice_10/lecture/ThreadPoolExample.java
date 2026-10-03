package practice_10.lecture;

import java.lang.reflect.Executable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i <= 5 ; i++) {
            final int taskNumber = i;
            executor.execute(()-> {
                System.out.println("Executing task " + taskNumber + " in " + Thread.currentThread().getName());
            });
        }
    }
}
