package practice_2;

public class BankAccount {
    String owner;
    double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        this.balance -= amount;
    }

    void printBalance() {
        System.out.println("Balance of the " + this.owner + "= " + this.balance);
    }
}
