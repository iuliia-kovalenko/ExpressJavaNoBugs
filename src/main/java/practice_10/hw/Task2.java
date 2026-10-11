package practice_10.hw;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        //Создайте два потока. Один поток должен печатать "A", второй — "B",
        // каждый по 5 раз с небольшой задержкой.
        //Создайте два класса или объекта Runnable.
        //Запустите оба потока через Thread и start().
        //Задержку организуйте с помощью Thread.sleep(500).

        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
