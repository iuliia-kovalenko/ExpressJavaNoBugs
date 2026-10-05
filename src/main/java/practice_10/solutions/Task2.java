package practice_10.solutions;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()-> System.out.println(Thread.currentThread().getName() + ": child"));
        t.run();
        t.start();
        t.join();
        System.out.println(Thread.currentThread().getName() + ": main");
    }
}
