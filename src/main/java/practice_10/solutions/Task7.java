package practice_10.solutions;

public class Task7 {
    static ThreadLocal<Integer> tl = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            tl.set(tl.get() + 1);
            tl.set(tl.get() + 1);
            System.out.println(Thread.currentThread().getName() + "=" + tl.get());
        };

        Thread t1 = new Thread(r, "A");
        Thread t2 = new Thread(r, "B");
        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("main=" + tl.get());
    }
}
