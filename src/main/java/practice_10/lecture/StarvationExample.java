package practice_10.lecture;

public class StarvationExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + " working");
                }
            });
            thread.setPriority(Thread.MIN_PRIORITY);
            thread.start();
        }
    }
}
