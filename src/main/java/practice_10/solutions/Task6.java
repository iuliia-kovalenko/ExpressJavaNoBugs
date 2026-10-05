package practice_10.solutions;

public class Task6 {
    static final Object lock = new Object();
    static boolean ready = false;

    public static void main(String[] args) throws InterruptedException {
        Thread waiter = new Thread(() -> {
            synchronized (lock) {
                while(!ready) {
                    try {
                        lock.wait();
                    } catch (InterruptedException ignored) {}
                }
                System.out.println("go");
            }
        });

        Thread notifier = new Thread(() -> {
            synchronized (lock) {
                ready = true;
                lock.notify();
            }
        });

        waiter.start();
        notifier.start();

        waiter.join();
        notifier.join();
    }
}
