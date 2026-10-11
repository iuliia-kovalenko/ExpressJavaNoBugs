package practice_10.hw;
 /*
 Создайте поток, который бесконечно увеличивает счетчик.
 В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.
 Объявите переменную volatile boolean stop.
В рабочем потоке используйте цикл while (!stop).
Основной поток должен заснуть на 2 секунды и затем установить stop = true.
  */

public class Task3 {
    static volatile boolean stop = false;
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while(!stop) {
                counter++;
            }
        });

        thread.start();
        Thread.sleep(2000);
        stop = true;
        thread.join();
        System.out.println(counter);
    }
}
