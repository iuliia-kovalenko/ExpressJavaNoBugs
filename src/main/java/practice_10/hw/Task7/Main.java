package practice_10.hw.Task7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Account account1 = new Account("first", 150);
        Account account2 = new Account("second", 50);

        ExecutorService pools = Executors.newFixedThreadPool(6);
        Runnable task1 = () -> {
            account1.transfer(account1, account2, 10);

        };
        Runnable task2 = () -> {
            account2.transfer(account2, account1, 1);
        };

        for (int i = 0; i < 5000; i++) {
            pools.submit(task1);
            pools.submit(task2);
        }
        pools.shutdown();
        pools.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}
