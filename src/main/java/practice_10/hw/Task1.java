package practice_10.hw;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        //Условие задачи: Напишите программу, в которой создается отдельный поток,
        //выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Привет из потока!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();
        thread.join();
    }
}
