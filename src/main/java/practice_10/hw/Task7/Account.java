package practice_10.hw.Task7;

import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;

/*
Напишите программу, которая моделирует работу банковского счета с несколькими потоками.
Каждый поток должен попытаться перевести деньги с одного счета на другой.
Для обеспечения правильной работы программы используйте ReentrantLock для синхронизации работы с двумя счетами.
 */
public class Account {
    private String name;
    private int id;
    private static int count = 0;
    private int balance;
    private ReentrantLock lock = new ReentrantLock();

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.id = ++count;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public boolean transfer(Account accountFrom, Account accountTo, int amount) {
        if (accountFrom.equals(accountTo)) {
            return false;
        }
        Account firstToLock;
        Account secondToLock;
        if (accountFrom.id > accountTo.id) {
            firstToLock = accountFrom;
            secondToLock = accountTo;
        } else {
            firstToLock = accountTo;
            secondToLock = accountFrom;
        }
        firstToLock.lock.lock();
        secondToLock.lock.lock();

        try {
            if (accountFrom.balance < amount || amount <= 0) {
                return false;
            }
            accountFrom.balance -= amount;
            accountTo.balance += amount;
        } finally {
            secondToLock.lock.unlock();
            firstToLock.lock.unlock();
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
