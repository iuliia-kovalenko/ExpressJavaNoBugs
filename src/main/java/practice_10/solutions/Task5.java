package practice_10.solutions;


public class Task5 {
    static final Object A = new Object();
    static final Object B = new Object();

    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            synchronized (A) {
                sleep(50);
                synchronized (B) {
                    System.out.println("t1");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (A) {
                sleep(50);
                synchronized (B) {
                    System.out.println("t2");
                }
            }
        });

        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("main");
    }

    static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ignored) {}
    }
}
