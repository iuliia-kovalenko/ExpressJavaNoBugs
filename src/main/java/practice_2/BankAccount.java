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

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Amount can not be negative");
            return;
        }
        if (this.balance < amount) {
            System.out.println("Not enough balance for withdrawal");
            return;
        }
        this.balance -= amount;
    }

    public void printBalance() {
        System.out.println("Balance of the " + this.owner + "= " + this.balance);
    }
}
