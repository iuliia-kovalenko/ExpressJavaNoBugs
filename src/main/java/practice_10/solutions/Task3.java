package practice_10.solutions;

public class Task3 {
    static volatile int x = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                x++;}
        });
        Thread b = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                x++;}
        });
        a.start();
        b.start();
        a.join();
        b.join();

        System.out.println(x);
    }
}
