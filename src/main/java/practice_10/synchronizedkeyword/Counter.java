package practice_10.synchronizedkeyword;

public class Counter {
    // методы по увеличению и уменьшению значения
    // задача реализовать решение в многопоточной среде

    public int count = 0;

    public synchronized void increment() {
        this.count++;
    }

    public synchronized void decrement() {
        this.count--;
    }

    public synchronized int getCount() {
        return this.count;
    }

}
