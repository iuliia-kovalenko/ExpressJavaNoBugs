package practice_10.solutions;

import java.util.concurrent.CountDownLatch;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);

        Thread t1 = new Thread(() -> {
            System.out.print("A");
            latch.countDown();
        });

        Thread t2 = new Thread(() -> {
            try {
                latch.await();
            } catch (
                    InterruptedException ignored
            ) {}
            System.out.print("B");
        });

        t2.start();
        t1.start();

        t1.join();
        t2.join();
    }
}
