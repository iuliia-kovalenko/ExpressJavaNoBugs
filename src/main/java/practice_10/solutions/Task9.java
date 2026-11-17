package practice_10.solutions;

public class Task9 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while(!Thread.currentThread().isInterrupted()) {
                // busy work
            }
            System.out.println("stopped");
        });

        t.start();
        Thread.sleep(50);
        t.interrupt();
        t.join();
        System.out.println("main");
    }
}
