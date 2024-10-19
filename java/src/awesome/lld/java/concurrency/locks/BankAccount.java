package awesome.lld.java.concurrency.locks;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * The BankAccount class represents a bank account with methods protected by a ReentrantLock.
 */
public class BankAccount {
    private double balance;
    private final Lock lock = new ReentrantLock();

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    /**
     * Method to deposit money into the account.
     *
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } finally {
            lock.unlock();
        }
    }

    /**
     * Method to withdraw money from the account.
     *
     * @param amount The amount to withdraw.
     */
    public void withdraw(double amount) {
        lock.lock();
        try {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
            } else {
                System.out.println("Insufficient balance to withdraw: " + amount);
            }
        } finally {
            lock.unlock();
        }
    }

    /**
     * Retrieves the current balance of the account.
     *
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }
}
