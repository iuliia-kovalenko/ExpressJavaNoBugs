package practice_10.hw;
/*
Напишите класс Counter с методом increment, увеличивающим значение счётчика.
Создайте два потока, каждый из которых вызывает increment() 1000 раз.
Обеспечьте правильную работу с помощью synchronized.
В классе Counter создайте метод public synchronized void increment().
Храните счетчик в переменной int count.
Создайте два потока, которые вызывают метод increment() в цикле.
После завершения потоков выведите финальное значение count — оно должно быть 2000.

 */

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                Counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                Counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(Counter.getCounter());
    }

}

class Counter {
    public static int counter = 0;

    public static synchronized void increment() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
