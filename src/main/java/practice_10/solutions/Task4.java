package practice_10.solutions;

import java.util.concurrent.atomic.AtomicInteger;

public class Task4 {
    static AtomicInteger x = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                x.incrementAndGet();}
        });
        Thread b = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                x.incrementAndGet();}
        });
        a.start();
        b.start();
        a.join();
        b.join();

        System.out.println(x.get());
    }
}
