package practice_10.solutions;

public class Task11 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Worker");
            System.out.println(Thread.currentThread().getName());
        });

        thread.run();
//        thread.start();
//        thread.join();

        System.out.println("Main");
        System.out.println(Thread.currentThread().getName());
    }
}
